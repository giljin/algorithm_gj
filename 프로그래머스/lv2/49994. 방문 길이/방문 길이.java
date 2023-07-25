import java.util.*;
class Solution {
    public int solution(String dirs) {
        int answer = 0;
        
        int[] location = {0, 0};
        Set<String> loads = new HashSet<>();
        for (int i = 0; i < dirs.length(); i++) {
            int x = location[0];
            int y = location[1];

            int mx = x;
            int my = y;
            char command = dirs.charAt(i);
            if( command == 'U' ){
                my--;
            }else if( command == 'R' ){
                mx++;
            }else if( command == 'D' ){
                my++;
            }else if( command == 'L' ){
                mx--;
            }

            if( mx >= -5 && mx <= 5 && my >= -5 && my <= 5 ){
                int sumx = x+mx;
                int sumy = y+my;
                if( loads.add(sumx+""+sumy) ){
                    answer++;
                }
                location = new int[]{mx, my};
            }
        }
        
        return answer;
    }
}