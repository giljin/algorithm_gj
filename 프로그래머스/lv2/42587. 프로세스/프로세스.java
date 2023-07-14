import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{i, priorities[i]});
        }

        Arrays.sort(priorities);
        int maxIndex = priorities.length-1;

        while (!queue.isEmpty()){
            int[] arr = queue.poll();
            int max = priorities[maxIndex];
            if( max == arr[1] ){
                answer++;
                maxIndex--;
                if(location == arr[0]){
                    break;
                }
            }else{
                queue.add(arr);
            }
        }

        return answer;
    }
}