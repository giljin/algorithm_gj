import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        int total = 0;
        for(int i=1; i<=no; i++){
            total += i;
        }
        System.out.println(total);
    }
}