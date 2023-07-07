import java.io.IOException;
import java.util.Scanner;

public class Main {

    static int[] memory;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        memory = new int[n+1];
        System.out.println(dp(n));
    }

    public static int dp(int n){
        for (int i = 2; i <= n; i++) {
            memory[i] = memory[i-1] + 1;

            if( i % 3 == 0 ){
                memory[i] = Math.min(memory[i], memory[i/3]+1);
            }
            if( i % 2 == 0 ){
                memory[i] = Math.min(memory[i], memory[i/2]+1);
            }
        }

        return memory[n];
    }

}
