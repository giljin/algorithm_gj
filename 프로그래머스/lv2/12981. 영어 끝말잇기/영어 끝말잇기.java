import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        Stack<String> playWords = new Stack<>();
        for (int i = 0; i < words.length; i++) {
            if(playWords.isEmpty()){
                playWords.push(words[i]);
                continue;
            }

            String lastWord = playWords.peek();
            if( lastWord.charAt(lastWord.length()-1) != words[i].charAt(0) ){
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }

            if( playWords.contains(words[i]) ){
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }

            playWords.push(words[i]);
        }
        return answer;
    }
}