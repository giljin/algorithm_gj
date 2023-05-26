import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken(" "));
        }

        int count = 0;
        int milk = 0;

        for (int i = 0; i < num; i++) {
            if(arr[i] == milk){
                count ++;
                milk++;
                if(milk == 3){
                    milk = 0;
                }
            }
        }
        System.out.println(count);
    }
}