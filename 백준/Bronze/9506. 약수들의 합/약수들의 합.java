import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        int number;

        while ( (number = scanner.nextInt()) > -1 ){
            List<Integer> divisors = new ArrayList<>();
            int sum = 0;
            for (int i = 2; i < number; i++) {
                if( number % i == 0 ){
                    divisors.add(i);
                    sum += i;
                }
            }
            if( ++sum == number ){
                System.out.print(number + " = 1 ");
                for (int i = 0; i < divisors.size(); i++) {
                    System.out.print("+ " + divisors.get(i) + " ");
                }
                System.out.println();
            }else{
                System.out.println(number + " is NOT perfect.");
            }
        }

    }

}