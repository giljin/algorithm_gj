class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while (true){
            if( s.equals("1") ){
                break;
            }

            answer[0]++;
            int beforeCount = s.length();
            s = s.replaceAll("0", "");
            answer[1] += beforeCount - s.length();
            s = Integer.toBinaryString(s.length());
        }

        return answer;
    }
}