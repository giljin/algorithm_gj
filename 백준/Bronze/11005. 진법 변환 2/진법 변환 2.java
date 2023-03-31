import java.util.*;
public class Main {
    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);

        int number = scanner.nextInt();
        int digit = scanner.nextInt();
        String result = "";
        while ( number > 0 ){
            int no = number % digit + 48;
            if( no > 57 ){
                no += 7;
            }
            result = (char)no + result;
            number /= digit;
        }
        System.out.println(result);
    }
}