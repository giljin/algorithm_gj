import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        if(T % 10 > 0){
            System.out.println(-1);
            return;
        }

        int[] timers = new int[]{300,60,10};
        for (int i = 0; i < timers.length; i++) {
            int count = T / timers[i];
            System.out.print(count + " ");
            T %= timers[i];
        }
    }
}