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
                int afterNumber = arr[0];
                if(i == 0){
                    afterNumber += options[i];
                }else{
                    afterNumber *= options[i];
                }

                if(afterNumber == y){
                    return arr[1]+1;
                }

                if( y > afterNumber ){
                    if( !visited[afterNumber] ){
                        visited[afterNumber] = true;
                        queue.add(new int[]{afterNumber, arr[1]+1});
                    }
                }
            }
        }
        return answer;
    }
}