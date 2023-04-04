import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        int[] x = new int[3];
        int[] y = new int[3];
        for (int i = 0; i < 3; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }
        System.out.print((x[0] == x[1] ? x[2] : x[0] == x[2] ? x[1] : x[0]) + " ");
        System.out.println(y[0] == y[1] ? y[2] : y[0] == y[2] ? y[1] : y[0]);
    }
}