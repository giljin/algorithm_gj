import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = 666;
        while (n > 0){
            String x = "666";
            String b = num + "";
            if( b.indexOf(x) > -1 ){
                n--;
            }
            num++;
        }
        System.out.println(num-1);
    }
}
