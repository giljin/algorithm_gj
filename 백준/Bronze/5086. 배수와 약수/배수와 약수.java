import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        while (true){
            int no1 = scanner.nextInt();
            int no2 = scanner.nextInt();
            if( no1 == 0 && no2 == 0 ){
                break;
            }

            if( no2 % no1 == 0 ){
                System.out.println("factor");
            }else if( no1 % no2 == 0 ){
                System.out.println("multiple");
            }else{
                System.out.println("neither");
            }

        }
    }

}