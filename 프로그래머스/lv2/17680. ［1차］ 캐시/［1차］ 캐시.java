import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        List<String> cache = new ArrayList<>();
        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();

            int cacheIndex = cache.indexOf(city);
            if( cacheIndex > -1 ){
                cache.add(cache.remove(cacheIndex));
                answer++;
            }else{
                if( cacheSize == 0 ) {
                    answer += 5;
                    continue;
                }
                
                if( cache.size() == cacheSize ){
                    cache.remove(0);
                }
                cache.add(city);
                answer += 5;
            }
        }

        
        return answer;
    }
}