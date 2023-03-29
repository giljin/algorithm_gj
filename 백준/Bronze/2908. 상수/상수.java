import java.util.*;
public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        String[] num1 = scanner.next().split("");
        String[] num2 = scanner.next().split("");

        int no1 = Integer.parseInt(num1[2] + num1[1] + num1[0]);
        int no2 = Integer.parseInt(num2[2] + num2[1] + num2[0]);
        if (no1 > no2){
            System.out.println(no1);
        }else{
            System.out.println(no2);
        }

    }
}