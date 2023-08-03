import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        int size = (int)(right - left);
        int[] answer = new int[size+1];

        int index = 0;
        for (long i = left; i <= right; i++) {
            long min = (i/ n);
            answer[index++] = (int)Math.max(i%n, min) + 1;
        }
        return answer;
    }
}