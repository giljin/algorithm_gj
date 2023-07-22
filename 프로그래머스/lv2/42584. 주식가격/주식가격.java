class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        answer[prices.length-1] = 0;

        for (int i = 1; i < prices.length; i++) {
            int index = prices.length-1-i;
            for (int j = index+1; j < prices.length; j++) {
                answer[index]++;
                if( prices[index] > prices[j] ){
                    break;
                }
            }
        }
        return answer;
    }
}