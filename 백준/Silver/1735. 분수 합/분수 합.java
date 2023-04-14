import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int bm = b * d;
        int bj = (a * d) + (c * b);
        int gcd = gcd(Math.max(bj, bm), Math.min(bj, bm));
        System.out.print(bj / gcd);
        System.out.println(" " + bm / gcd);
    }
    public static int gcd(int a, int b){
        if( b == 0 ){
            return a;
        }
        return gcd(b, a%b);
    }

}