import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for(int i=0; i<count; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(sum(a,b));
        }
    }
    public static int sum(int a, int b){
        return a+b;
    }
}