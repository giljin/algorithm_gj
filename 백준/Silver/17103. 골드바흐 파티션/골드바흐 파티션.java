import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] primes = new boolean[1000001];
        int t = Integer.parseInt(br.readLine());
        for (int i = 2; i < 1000000; i++) {
            primes[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(primes.length); i++) {
            if(primes[i]){
                for(int j = i*i; j<=1000000; j+=i){
                    primes[j] = false;
                }
            }
        }
        for (int i = 0; i < t; i++) {
            int number = Integer.parseInt(br.readLine());
            int count = 0;
            for (int j = 2; j <= number/2; j++) {
                if( primes[j] && primes[number-j] ){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

}