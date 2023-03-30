import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        int max = -1;
        String location = "";
        for (int i = 0; i < 81; i++) {
            int num = scanner.nextInt();
            if( num > max ){
                max = num;
                location = (i/9+1) + " " + (i%9+1);
            }
        }
        System.out.println(max);
        System.out.println(location);
    }

}