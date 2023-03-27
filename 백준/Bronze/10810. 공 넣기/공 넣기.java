import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = reader.readLine().split(" ");
        int basketSize = Integer.parseInt(NM[0]);
        int count = Integer.parseInt(NM[1]);
        int[] baskets = new int[basketSize];
        for(int i=0; i<count; i++){
            String[] values = reader.readLine().split(" ");
            int startBasket = Integer.parseInt(values[0]);
            int endBasket = Integer.parseInt(values[1]);
            int num = Integer.parseInt(values[2]);
            for (int j=startBasket-1; j<endBasket; j++){
                baskets[j] = num;
            }
        }

        for (int i = 0; i < baskets.length; i++) {
            System.out.print(baskets[i] + " ");
        }

    }
}