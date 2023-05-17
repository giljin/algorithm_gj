import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = scanner.nextInt();
        }

        int result = 0;
        for (int i = N - 1; i >= 0 || K > 0; i--) {
            if (coins[i] <= K) {
                result += K / coins[i];
                K %= coins[i];
            }
        }
        System.out.println(result);
    }
}