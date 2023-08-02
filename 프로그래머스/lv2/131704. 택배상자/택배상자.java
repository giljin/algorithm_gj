import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i <= order.length; i++) {
            if(order[answer] == i){
                answer++;
            }else if( stack.size() > 0 && stack.peek() == order[answer] ){
                i--;
                stack.pop();
                answer++;
            }else{
                stack.push(i);
            }
        }
        
        while (!stack.isEmpty()){
            if( stack.peek() == order[answer] ){
                stack.pop();
                answer++;
            }else{
                break;
            }
        }
        
        return answer;
    }
}