class Solution {
    public int solution(int n, int k){
        int answer = 0;

        String number = Integer.toString(n, k);
        String[] numbers = number.split("0");
        for (int i = 0; i < numbers.length; i++) {
            if( numbers[i].isEmpty() ){
                continue;
            }
            if( isPrime(Long.parseLong(numbers[i])) ){
                answer++;
            }
        }
        return answer;
    }
    public boolean isPrime(long num){
        if(num == 1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}