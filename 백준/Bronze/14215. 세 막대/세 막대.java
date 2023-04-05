import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = Math.max(Math.max(a,b),c);
        int m = (a+b+c-max);
        if ( m > max ){
            System.out.println(a+b+c);
        } else {
            System.out.println((a+b+c-max)*2-1);
        }
    }
}