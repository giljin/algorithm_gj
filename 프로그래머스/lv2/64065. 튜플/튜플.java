import java.util.*;
class Solution {
    public int[] solution(String s) {
        s = s.substring(1, s.length()-2)
                .replace("{", "");
        String[] arr = s.split("},");
        Arrays.sort(arr, Comparator.comparingInt(String::length));

        boolean[] checked = new boolean[100000];
        int[] answer = new int[arr.length];
        int answerIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            String[] nums = arr[i].split(",");
            for (int j = 0; j < nums.length; j++) {
                int number = Integer.parseInt(nums[j]);
                if( !checked[number] ){
                    checked[number] = true;
                    answer[answerIndex++] = number;
                }
            }
        }
        return answer;
    }
}