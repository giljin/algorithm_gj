import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        System.out.println(factorial(n) / factorial(n-k) / factorial(k));
    }
    public static int factorial(int no){
        int result = 1;
        for (int i = 1; i <= no; i++) {
            result *= i;
        }
        return result;
    }

}