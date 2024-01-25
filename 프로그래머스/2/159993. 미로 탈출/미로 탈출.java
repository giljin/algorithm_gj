import java.util.*;

class Solution {
    String[] sMaps;
    public int solution(String[] maps) {
        int answer = 0;
        sMaps = maps;
        
        Location start = findStartLocation();
        
        Location lever = BFS('L', start.x, start.y);
        if(lever == null){
            return -1;
        }
        Location exit = BFS('E', lever.x, lever.y);
        if(exit == null){
            return -1;
        }
        return lever.time + exit.time;
    }
    public Location findStartLocation(){
        for(int i=0; i<sMaps.length; i++){
            for(int j=0; j<sMaps[i].length(); j++){
                if(sMaps[i].charAt(j) == 'S'){
                    return new Location(j, i, 0);
                }
            }
        }
        return null;
    }
    
    public Location BFS(char targetMiro, int x, int y){
        Queue<Location> queue = new LinkedList<>();
        queue.add(new Location(x, y, 0));
        
        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};
        
        boolean[][] visited = new boolean[sMaps.length][sMaps[0].length()];
        visited[y][x] = true;
        
        while(!queue.isEmpty()){
            Location location = queue.poll();
            for(int i=0; i<4; i++){
                int mx = location.x + dx[i];
                int my = location.y + dy[i];
                if (mx >= 0 && my >= 0 && mx < sMaps[0].length() && my < sMaps.length){
                    char nextMiro = sMaps[my].charAt(mx);
                    if (!visited[my][mx] && nextMiro != 'X'){
                        Location nextLocation = new Location(mx, my, location.time + 1);
                        visited[my][mx] = true;
                        if (nextMiro == targetMiro){
                            return nextLocation;
                        }
                        queue.add(nextLocation);
                    }
                }
            }
        }
        return null;
    }
    
    class Location{
        int x;
        int y;
        int time;
        Location(){}
        Location(int x, int y, int time){
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }
}