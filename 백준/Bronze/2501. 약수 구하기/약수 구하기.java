import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        int number = scanner.nextInt();
        int rank = scanner.nextInt();
        int count = 0;
        int result = 0;
        for (int i = 1; i <= number; i++) {
            if(number % i == 0){
                count++;
                if( count == rank ){
                    result = i;
                    break;
                }
            }
        }
        System.out.println(result);
    }

}