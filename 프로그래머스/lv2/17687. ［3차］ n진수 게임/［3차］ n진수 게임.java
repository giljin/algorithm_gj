class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m*t; i++) {
            sb.append(Integer.toString(i, n).toUpperCase());
            if((i % m)+1 == p){
                answer.append(sb.charAt(i));
            }
        }
        return answer.toString();
    }
}