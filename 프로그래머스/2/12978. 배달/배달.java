class Solution {
    int[] times;
    int[][] nodes;
    
    public int solution(int N, int[][] road, int K) {
        int answer = 0;

        nodes = new int[N+1][N+1];
        for(int i=1; i<nodes.length; i++){
            for(int j=1; j<nodes[i].length; j++){
                nodes[i][j] = Integer.MAX_VALUE;
            }   
        }
        
        for(int[] roadInfo : road){
            nodes[roadInfo[0]][roadInfo[1]] = Math.min(nodes[roadInfo[0]][roadInfo[1]], roadInfo[2]);
            nodes[roadInfo[1]][roadInfo[0]] = Math.min(nodes[roadInfo[1]][roadInfo[0]], roadInfo[2]);
            
        }
        
        times = new int[N+1];
        for(int i=2; i<times.length; i++){
            times[i] = Integer.MAX_VALUE;
        }
        
        boolean[] visited = new boolean[N+1];
        visited[1] = true;
        find(visited, 1, 0, K);
        
        for(int i=1; i<times.length; i++){
            if(times[i] < Integer.MAX_VALUE){
                answer++;
            }
        }

        return answer;
    }
    
    public void find(boolean[] visited, int node, int time, int max){
        times[node] = time;
        
        for(int i=2; i<nodes.length; i++){
            if(!visited[i] && nodes[node][i] < Integer.MAX_VALUE){
                visited[i] = true;
                int nextTime = time + nodes[node][i];
                if(nextTime <= max && times[i] > nextTime){
                    find(visited, i, nextTime, max);    
                }
                visited[i] = false;
            }
        }
    }
}