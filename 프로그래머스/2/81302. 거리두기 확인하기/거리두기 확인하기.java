import java.util.*;
class Solution {
    final char people = 'P';
    final char empty = 'O';
    
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        
        // 강의실
        for(int i=0; i<places.length; i++){
            answer[i] = checkPlace(places[i]);
        }
        
        return answer;
    }
    
    public int checkPlace(String[] place){
        
        for(int i=0; i<place.length; i++){
            for(int j=0; j<place[i].length(); j++){
                char space = place[i].charAt(j);
                if(space == people){
                    boolean isManhattanDistance = checkManhattanDistance(place, i, j);
                    if(!isManhattanDistance){
                        return 0;
                    }
                }
            }
        }
        
        return 1;
    }
    
    public boolean checkManhattanDistance(String[] place, int row, int column){
        boolean[][] visited = new boolean[5][5];
        
        Queue<Location> queue = new LinkedList<>();
        queue.add(new Location(row, column, 0));
        visited[row][column] = true;
        
        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};
        int LimmitMangattanDistance = 2;
        char empty = 'O';
        
        while(!queue.isEmpty()){
            Location location = queue.poll();
            if(location.depth >= 2){
                return true;
            }
            
            for(int i=0; i<4; i++){
                int mx = location.col + dx[i];
                int my = location.row + dy[i];
                if(mx >= 0 && my >= 0 && mx < 5 && my < 5){
                    if(!visited[my][mx]){
                        char space = place[my].charAt(mx);
                        if(space == people){
                            return false;
                        }
                        if(space == empty){
                            queue.add(new Location(my, mx, location.depth + 1));    
                        }
                    }
                }
            }
        }
        return true;
    }
    class Location{
        int row;
        int col;
        int depth;
        
        Location(int row, int col, int depth){
            this.row = row;
            this.col = col;
            this.depth = depth;
        }
    }
}