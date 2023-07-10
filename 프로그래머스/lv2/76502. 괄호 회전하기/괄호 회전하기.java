import java.util.*;
class Solution {
    Map<Character, Character> map = new HashMap<>();
    public int solution(String s) {
        int answer = 0;
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        for (int i = 0; i < s.length(); i++) {
            String rotate = s.substring(i) + s.substring(0, i);
            if( checkString(rotate) ){
                answer++;
            }
        }

        return answer;
    }
    
    public boolean checkString(String str){
        Stack<Character> stack = new Stack<>();
        stack.push(str.charAt(0));
        for (int j = 1; j < str.length(); j++) {
            char item = str.charAt(j);
            if( item == '(' || item == '{' || item == '[' || stack.isEmpty() ){
                stack.push(item);
            }else{
                char last = stack.pop();
                if( map.get(last) == null ){
                    return false;
                }
                if( !map.get(last).equals(item) ){
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}