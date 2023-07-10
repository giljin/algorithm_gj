import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int[] arr = new int[100000001];

        for (int i = 0; i < tangerine.length; i++) {
            arr[tangerine[i]]++;
        }

        Arrays.sort(arr);
        int i = arr.length-1;
        while (k>0){
            k -= arr[i--];
            answer++;
        }
        return answer;
    }
}