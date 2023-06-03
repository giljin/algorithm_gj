import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int needLine = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int packageCount = needLine / 6;
        int singleCount = needLine % 6;

        int packageMinPrice = Integer.MAX_VALUE;
        int singleMinPrice = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            StringTokenizer priceTokens = new StringTokenizer(br.readLine());
            int packagePrice = Integer.parseInt(priceTokens.nextToken());
            int singlePrice = Integer.parseInt(priceTokens.nextToken());
            packageMinPrice = Math.min(packageMinPrice, packagePrice);
            singleMinPrice = Math.min(singleMinPrice, singlePrice);
        }

        if(packageMinPrice > singleMinPrice * 6){
            System.out.println(singleMinPrice * needLine);
        }else if( packageMinPrice > singleMinPrice * singleCount ){
            System.out.println((packageMinPrice * packageCount) + (singleMinPrice * singleCount));
        }else{
            System.out.println(packageMinPrice * (packageCount+1));
        }

    }
}
