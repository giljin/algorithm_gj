class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        answer[prices.length-1] = 0;

        for (int i = 1; i < prices.length; i++) {
            int index = prices.length-1-i;
            for (int j = index+1; j < prices.length; j++) {
                if( prices[index] > prices[j] ){
                    answer[index] = j-index;
                    break;
                }
            }
            if( answer[index] == 0 ){
                answer[index] = i;
            }
        }
        return answer;
    }
}