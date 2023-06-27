import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String[] prices = br.readLine().split(" ");

            long result = 0;
            long max = 0;
            for (int j = n-1; j >= 0; j--) {
                long currentPrice = Long.parseLong(prices[j]);
                if( currentPrice > max ){
                    max = currentPrice;
                }else{
                    result += max - currentPrice;
                }
            }
            System.out.println(result);
        }
    }
}