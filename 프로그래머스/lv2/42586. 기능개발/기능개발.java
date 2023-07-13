class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] arr = new int[100];

        int prevDays = (int)Math.ceil((100 - progresses[0]) / (speeds[0]*1.0));
        int index = 0;
        arr[index]++;
        for (int i = 1; i < progresses.length; i++) {
            int days = (int)Math.ceil((100 - progresses[i]) / (speeds[i]*1.0));
            if(prevDays < days){
                prevDays = days;
                index++;
            }
            arr[index]++;
        }

        int[] answer = new int[index+1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[i];
        }

        return answer;
    }
}