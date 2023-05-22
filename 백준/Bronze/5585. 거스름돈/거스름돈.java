import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] money = new int[]{500,100,50,10,5,1};
        int N = 1000 - scanner.nextInt();
        int result = 0;
        for (int i = 0; i < money.length && N > 0; i++) {
            if( N / money[i] > 0 ){
                result += N / money[i];
                N %= money[i];
            }
        }
        System.out.println(result);
    }
}
