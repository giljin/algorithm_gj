import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = reader.readLine().split(" ");
        int basketSize = Integer.parseInt(NM[0]);
        int count = Integer.parseInt(NM[1]);
        int[] baskets = new int[basketSize];
        for (int i = 0; i < baskets.length; i++) {
            baskets[i] = i+1;
        }

        for(int i=0; i<count; i++){
            String[] values = reader.readLine().split(" ");
            int index1 = Integer.parseInt(values[0])-1;
            int index2 = Integer.parseInt(values[1])-1;
            int num = baskets[index1];
            baskets[index1] = baskets[index2];
            baskets[index2] = num;
        }

        for (int i = 0; i < baskets.length; i++) {
            System.out.print(baskets[i] + " ");
        }

    }
}