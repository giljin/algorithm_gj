import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        char[] numbers = br.readLine().toCharArray();

        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for(int i = 0; i < numbers.length; i++) {
            int no = numbers[i] - '0';

            while(count < k && !stack.isEmpty() && stack.peek() < no) {
                stack.pop();
                count++;
            }
            stack.add(no);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numbers.length - k; i++) {
            sb.append(stack.get(i));
        }
        System.out.print(sb);

    }
}