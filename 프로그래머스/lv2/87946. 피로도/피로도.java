
class Solution {
    int[][] sDungeons;
    boolean[] sVisited;
    int max = -1;
    
    public int solution(int k, int[][] dungeons) {
        sDungeons = dungeons;
        sVisited = new boolean[dungeons.length];
        DFS(k, 0);

        return max;
    }
    
    public void DFS(int k,int depth){
        for (int i = 0; i < sDungeons.length; i++) {
            if( !sVisited[i] && k >= sDungeons[i][0] ){
                sVisited[i] = true;
                DFS(k-sDungeons[i][1], depth+1);
                sVisited[i] = false;
            }
        }

        max = Math.max(max, depth);
    }
}