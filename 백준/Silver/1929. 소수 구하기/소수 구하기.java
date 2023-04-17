import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            if( isPrimeNumber(i) ){
                System.out.println(i);
            }
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