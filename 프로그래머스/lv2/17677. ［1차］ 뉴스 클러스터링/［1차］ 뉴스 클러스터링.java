import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        List<String> str1List = new ArrayList<>();
        for (int i = 0; i < str1.length()-1; i++) {
            String word = str1.substring(i, i+2);
            if( word.charAt(0) >= 'a' && word.charAt(0) <= 'z' && word.charAt(1) >= 'a' && word.charAt(1) <= 'z' ){
                str1List.add(str1.substring(i, i+2));
            }
        }

        str2 = str2.toLowerCase();
        List<String> str2List = new ArrayList<>();
        for (int i = 0; i < str2.length()-1; i++) {
            String word = str2.substring(i, i+2);
            if( word.charAt(0) >= 'a' && word.charAt(0) <= 'z' && word.charAt(1) >= 'a' && word.charAt(1) <= 'z' ){
                str2List.add(str2.substring(i, i+2));
            }
        }

        int cross = 0;
        int sum = 0;
        for (int i = 0; i < str1List.size(); i++) {
            String word = str1List.get(i);
            int search = str2List.indexOf(word);

            //합집합 카운트
            sum++;
            if( search > -1 ){
                //교집합 카운트
                cross++;
                str1List.remove(i--);
                str2List.remove(search);
            }
        }
        sum += str2List.size();

        double jacquard = 1;
        if(sum > 0 || cross > 0){
            jacquard = cross/(sum*1.0);
        }

        return (int)((jacquard) * 65536);
    }
}