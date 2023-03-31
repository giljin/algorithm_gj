import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        int number = scanner.nextInt();
        int tmp = 1, i = 0;
        while (true){
            tmp += 6 * i;
            i++;
            if( tmp >= number ){
                System.out.println(i);
                break;
            }
        }
    }

}