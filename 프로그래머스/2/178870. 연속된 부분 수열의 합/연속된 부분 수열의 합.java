class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {};

        int max = sequence.length - 1;
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] > k) {
                max = i;
                break;
            }
        }

        int sum = sequence[0];
        int start = 0;
        int end = 0;
        int size = Integer.MAX_VALUE;
        while (true) {
            if (sum == k) {
                int currentSize = end - start + 1;
                if (size > currentSize) {
                    size = currentSize;
                    answer = new int[]{start, end};
                }
            }
            if (end == max && start == max) {
                break;
            }
            if (sum < k && end < max) {
                end++;
                sum += sequence[end];
            } else {
                sum -= sequence[start];
                start++;
            }
        }
        return answer;
    }
}