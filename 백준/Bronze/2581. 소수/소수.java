import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int sum = 0;
        int min = -1;
        for (int i = m; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if( i % j == 0 ){
                    count++;
                }
            }
            if( count == 2 ){
                sum += i;
                if( min == -1 ){
                    min = i;
                }
            }
        }

        if (min == -1){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }

}