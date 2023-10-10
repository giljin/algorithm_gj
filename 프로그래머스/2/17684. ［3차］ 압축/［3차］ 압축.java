import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String msg) {
        List<String> dictionary = initDictionary();

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < msg.length(); i++) {
            for (int j = dictionary.size()-1; j >= 0; j--) {
                String dictionaryWord = dictionary.get(j);
                if( msg.substring(i).startsWith(dictionaryWord) ){
                    // 사전 인덱스 저장
                    result.add(j+1);

                    // 입력 인덱스 변경
                    i += dictionaryWord.length() - 1;

                    // 신규단어 저장
                    if( i+1 < msg.length() ){
                        dictionary.add( dictionaryWord + msg.charAt(i+1) );
                    }
                    break;
                }
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
    
    List<String> initDictionary(){
        List<String> dictionary = new ArrayList<>();
        for (int i=1; i<27; i++){
            dictionary.add(String.valueOf((char)(64 + i)));
        }
        return dictionary;
    }
}