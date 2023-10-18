class Solution {
    int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};
    int[][] map;
    
    public int solution(int[][] board) {
        int answer = board.length * board.length;

        map = board;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if( map[i][j] == 1 ){
                    answer -= getDangerZoneCount(new Location(j, i)) + 1;
                }
            }
        }

        return answer;
    }
    
    public int getDangerZoneCount(Location location){
        int dangerCount = 0;
        for (int i = 0; i < 8; i++) {
            int mx = location.x + dx[i];
            int my = location.y + dy[i];
            if( my < map.length && my >= 0 && mx < map.length && mx >= 0 && map[my][mx] == 0 ){
                map[my][mx] = 2;
                dangerCount++;
            }
        }
        return dangerCount;
    }
    
    public class Location{
        int x;
        int y;

        public Location(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}