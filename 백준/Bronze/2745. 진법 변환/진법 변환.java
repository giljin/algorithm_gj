import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        int result =0;
        String number = scanner.next();
        int digit = scanner.nextInt();
        for (int i = 0; i < number.length(); i++) {
            int no = number.charAt(number.length()-1-i) - 48;
            if( no > 9 ){
                no -= 7;
            }
            result += no * Math.pow(digit, i);
        }

        System.out.println(result);
    }

}