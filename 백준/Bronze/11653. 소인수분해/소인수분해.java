import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> divisors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if( n % i == 0 ){
                divisors.add(i);
            }
        }
        while ( n > 1 ){
            for (int i = 0; i < divisors.size(); i++) {
                int divisor = divisors.get(i);
                if( n % divisor == 0 ){
                    System.out.println(divisor);
                    n /= divisor;
                    break;
                }
            }
        }

    }

}