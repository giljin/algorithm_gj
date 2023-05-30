import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if( N == 1 ){
            System.out.println(0);
            return;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }

        int result = 0;
        while (pq.size() != 1){
            int num1 = pq.poll();
            int num2 = pq.poll();
            result += num1 + num2;
            pq.add(num1+num2);
        }
        System.out.println(result);
    }
}