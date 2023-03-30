import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] nm = new int[n][m];

        for (int i = 0; i < n * 2; i++) {
            for (int j = 0; j < m; j++) {
                int num = scanner.nextInt();
                nm[i%n][j] += num;
            }
        }

        for (int i = 0; i < nm.length; i++) {
            for (int j = 0; j < nm[0].length; j++) {
                System.out.print(nm[i][j] + " ");
            }
            System.out.println();
        }

    }

}