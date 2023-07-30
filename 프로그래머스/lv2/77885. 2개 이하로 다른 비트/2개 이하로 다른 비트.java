class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for(int i = 0; i< answer.length; i++){
            long nextNumber = numbers[i] + 1;
            answer[i] = nextNumber + ((nextNumber^numbers[i])>>2);
        }

        return answer;
    }
}