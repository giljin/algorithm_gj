import java.util.*;

class Solution {
    int[][] arr;
    public int solution(int n, int[][] wires) {
        int answer = n;
        
        arr = new int[n+1][n+1];
        for(int i=0; i<wires.length; i++){
            arr[wires[i][0]][wires[i][1]] = 1;
            arr[wires[i][1]][wires[i][0]] = 1;
        }
        
        for(int i=0; i<wires.length; i++){
            arr[wires[i][0]][wires[i][1]] = 0;
            arr[wires[i][1]][wires[i][0]] = 0;
            
            answer = Math.min(answer, bfs(n, wires[i][0]));
            
            arr[wires[i][0]][wires[i][1]] = 1;
            arr[wires[i][1]][wires[i][0]] = 1;
        }
        
    
        return answer;
    }
    
    public int bfs(int n, int start){
        int[] visited = new int[n+1];
        int cnt = 1;
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        
        while(!queue.isEmpty()){
            int index = queue.poll();
            visited[index] = 1;
            
            for(int i=1; i<=n; i++){ 
                if(visited[i] == 1){
                    continue;  
                } 
                if(arr[index][i] == 1) {
                    queue.add(i);
                    cnt++;
                }
            }
        }
        
        return Math.abs(n-2*cnt);
    }
    

}