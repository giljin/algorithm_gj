import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int max = 0;
        for (int i = 0; i < N; i++) {
            int weight = arr[i] * (N-i);
            if(weight > max){
                max = weight;
            }
        }
        System.out.println(max);
    }
}