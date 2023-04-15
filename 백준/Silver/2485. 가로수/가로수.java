import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] arr = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        long a = arr[1] - arr[0];
        long b = arr[2] - arr[1];
        long gcd = gcd(Math.max(a, b), Math.min(a, b));
        for (int i = 3; i < arr.length; i++) {
            long c = arr[i] - arr[i-1];
            gcd = gcd(Math.max(gcd, c), Math.min(gcd, c));
        }

        System.out.println((arr[arr.length-1] - arr[0]) / gcd + 1 - N);
    }
    public static long gcd (long a, long b){
        if( b == 0 ){
            return a;
        }
        
        return gcd(b, a%b);
    }
}
;