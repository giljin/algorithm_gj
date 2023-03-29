import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        int maxLine = 2*n-1;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = n-i; j <= n+i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < maxLine; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= maxLine-((i+1)*2); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}