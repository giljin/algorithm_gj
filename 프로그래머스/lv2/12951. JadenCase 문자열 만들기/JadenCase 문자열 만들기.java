class Solution {
    public String solution(String s) {
        String answer = "";
        while (true){
            int index = s.indexOf(' ');
            if( index == -1 ){
                if( !s.isEmpty() ){
                    answer += s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
                }
                break;
            }
            String word = s.substring(0, index+1);
            if( word.charAt(0) >= '0' && word.charAt(0) <= '9' ){
                answer += word.toLowerCase();
            }else{
                answer += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            }

            s = s.substring(index+1);
        }
        return answer;
    }
}