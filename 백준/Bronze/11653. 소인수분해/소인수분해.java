import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();

        int t = n;
        for (int i = 2; i <= n; i++) {
            while ( t % i == 0 ){
                t /= i;
                System.out.println(i);
            }
        }
    }
}