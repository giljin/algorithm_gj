import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a+b;
        while(sum>0){
            System.out.println(sum);
            a = scanner.nextInt();
            b = scanner.nextInt();
            sum = a+b;
        }
    }
}