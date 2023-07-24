import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = -1;
        
        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};
        
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        visited[0][0] = true;
        Queue<Location> queue = new LinkedList<>();
        queue.add(new Location(0, 0, 1));
        
        while (!queue.isEmpty()){
            Location location = queue.poll();
            
            for (int i = 0; i < 4; i++) {
                int mx = location.x + dx[i];
                int my = location.y + dy[i];
                if( mx >= 0 && mx < maps[0].length && my >= 0 && my < maps.length){
                    if( mx == maps[0].length-1 && my == maps.length-1){
                        return location.depth+1;
                    }
                    
                    if( !visited[my][mx] && maps[my][mx] == 1 ){
                        visited[my][mx] = true;
                        queue.add(new Location(mx, my, location.depth+1));
                    }
                }
            }
        }
        return answer;
    }
    
    public class Location{
        private int x;
        private int y;
        private int depth;
        public Location(int x, int y, int depth){
            this.x = x;
            this.y = y;
            this.depth = depth;
        }
    }
}