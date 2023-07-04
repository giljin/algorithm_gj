import java.util.*;
class Solution {
    int count;
    String no;
    List<Integer> primes = new ArrayList<>();
    
    public int solution(String numbers) {
        no = numbers;
        for (int i = 1; i <= numbers.length(); i++) {
            DFS(i, "");
        }

        return count;
    }
    
    public void DFS(int max, String indexs){

        if( max == indexs.length() ){
            String number = "";
            for (int i = 0; i < indexs.length(); i++) {
                number += no.charAt(indexs.charAt(i)-'0') + "";
            }
            int sumNumber = Integer.parseInt(number);
            if( isPrime(sumNumber) && !primes.contains(sumNumber) ){
                primes.add(sumNumber);
                count++;
            }
            return;
        }

        for (int i = 0; i < no.length(); i++) {
            if( !indexs.contains(i+"") ){
                DFS(max, indexs+i);
            }
        }
    }

    public boolean isPrime(int number){
        if( number < 2 ){
            return false;
        }

        if( number == 2 ){
            return true;
        }

        for (int i = 2; i < number; i++) {
            if( number % i == 0 ){
                return false;
            }
        }
        return true;
    }
}