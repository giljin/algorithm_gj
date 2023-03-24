import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, List<String>> clothesMap = new HashMap<>();

        for( String[] clothe : clothes ){
            clothesMap.put(clothe[1], new ArrayList<>());
        }

        for( String[] clothe : clothes ){
            clothesMap.get(clothe[1]).add(clothe[0]);
        }

        for (String key : clothesMap.keySet() ){
            answer *= clothesMap.get(key).size() + 1;
        }
        
        return answer-1;
    }
}