import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        int count = n;
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if ( number == 1 ){
                count--;
                continue;
            }
            for (int j = 2; j < number; j++) {
                if( number % j == 0 ){
                    count--;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}