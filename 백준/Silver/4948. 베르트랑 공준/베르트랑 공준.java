import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a;
        while ( (a = Integer.parseInt(br.readLine())) > 0 ){
            int count = 0;
            for (int i = a+1; i <= 2*a; i++) {
                if (isPrimeNumber(i)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    public static boolean isPrimeNumber(int x){
        if( x < 2 ){
            return false;
        }
        if( x == 2 ){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if( x % i == 0){
                return false;
            }
        }
        return true;
    }
}