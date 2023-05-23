import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        long S = scanner.nextLong();
        long sum = 0;
        long N;
        for (N = 1; sum <= S; N++) {
            sum += N;
        }

        System.out.println(N-2);
    }
}