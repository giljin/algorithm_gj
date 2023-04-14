import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(lcm(Math.max(a,b), Math.min(a,b)));
        }
    }
    public static int gcd(int a, int b){
        if( b == 0 ){
            return a;
        }
        return gcd(b, a%b);
    }

    public static int lcm(int a, int b){
        return a * b / gcd(a,b);
    }
}