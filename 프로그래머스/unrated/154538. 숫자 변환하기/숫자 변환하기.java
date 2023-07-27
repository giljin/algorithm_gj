import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
        int answer = -1;
        
        if( x == y ){
            return 0;
        }
        
        boolean[] visited = new boolean[1000001];
        visited[x] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, 0});

        int[] options = {n, 2, 3};
        while (!queue.isEmpty()){
            int[] arr = queue.poll();

            for (int i = 0; i < options.length; i++) {
                int beforeNumber = arr[0];
                if(i == 0){
                    beforeNumber += options[i];
                }else{
                    beforeNumber *= options[i];
                }
                
                if(beforeNumber == y){
                    return arr[1]+1;
                }
                if( y > beforeNumber ){
                    if( !visited[beforeNumber] ){
                        visited[beforeNumber] = true;
                        queue.add(new int[]{beforeNumber, arr[1]+1});    
                    }
                }
            }
        }
        return answer;
    }
}