import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        System.out.println(lcm(Math.max(a,b), Math.min(a,b)));
    }
    public static long gcd(long a, long b){
        if( b == 0 ){
            return a;
        }
        return gcd(b, a%b);
    }

    public static long lcm(long a, long b){
        return a * b / gcd(a,b);
    }
}