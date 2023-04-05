import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        while (true){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int sum = a+b+c;
            if( sum == 0 ){
                break;
            }

            int max = Math.max(Math.max(a, b),c);
            if (a == b && a == c) {
                System.out.println("Equilateral");
            } else if (sum - max <= max) {
                System.out.println("Invalid");
            } else if (a == b || a == c || b == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}