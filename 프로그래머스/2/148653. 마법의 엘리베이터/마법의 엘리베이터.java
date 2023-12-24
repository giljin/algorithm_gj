class Solution {
    public int solution(int storey) {
        int answer = 0;
        
        while( storey != 0 ){
            int modStorey = storey % 10;
            
            if( modStorey == 5 ){
                int nextStorey = storey / 10 % 10;
                if( nextStorey < 5 ){
                    answer += modStorey;
                }else{
                    storey += 10;
                    answer += 10 - modStorey;
                }
            }else if( modStorey < 5 ){
                answer += modStorey;
            }else{
                answer += 10 - modStorey;
                storey += 10;
            }
            storey /= 10;
        }

        return answer;
    }
}