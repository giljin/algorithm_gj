import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i=0; i<10; i++){

            int n = scanner.nextInt();
            int a = sum + n;
            if( a >= 100 ){

                int before = 100 - sum;
                int after = a - 100;

                sum = before < after ? sum : a;
                break;
            }
            sum += n;
        }
        System.out.println(sum);
    }
}