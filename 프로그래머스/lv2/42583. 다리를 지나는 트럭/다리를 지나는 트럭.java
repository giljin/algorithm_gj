import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Integer> bridge = new LinkedList<>();

        int bridgeWeightSum = 0;
        int i = 0;
        while (true){

            if( bridgeWeightSum + truck_weights[i] <= weight ){
                bridgeWeightSum += truck_weights[i];
                bridge.add(truck_weights[i++]);
                answer++;
                if( i == truck_weights.length ){
                    answer += bridge_length;
                    break;
                }
            }else if(bridge.size() < bridge_length){
                bridge.add(0);
                answer++;
            }else{
                bridgeWeightSum -= bridge.poll();
            }

        }
        return answer;
    }
}