import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<int[]> specs = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            specs.add(new int[]{scanner.nextInt(), scanner.nextInt()});
        }

        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 0; j < N; j++) {
                if( i != j ){
                    int[] a = specs.get(i);
                    int[] b = specs.get(j);
                    if( a[0] < b[0] && a[1] < b[1] ){
                        count++;
                    }
                }
            }
            System.out.print(count + " ");
        }
    }
}
