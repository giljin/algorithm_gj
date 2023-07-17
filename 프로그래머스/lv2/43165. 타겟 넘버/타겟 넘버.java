import java.util.*;
class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(numbers);
        while (!queue.isEmpty()){
            int[] qNumbers = queue.poll();

            int sum = 0;
            int lastMinusIndex = -1;
            for (int i = 0; i < qNumbers.length; i++) {
                sum += qNumbers[i];
                if( qNumbers[i] < 0 ){
                    lastMinusIndex = i;
                }
            }
            if (sum==target) {
                answer++;
            }

            for (int i = lastMinusIndex+1; i < qNumbers.length; i++) {
                int[] numberArr = qNumbers.clone();
                numberArr[i] *= -1;
                queue.add(numberArr);
            }
        }
        
        return answer;
    }
}