import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String command = br.readLine();
            if( command.equals("top") ){
                sb.append(stack.isEmpty() ? -1 : stack.get(stack.size()-1)).append("\n");
            } else if (command.equals("empty")) {
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            } else if (command.equals("size")){
                sb.append(stack.size()).append("\n");
            } else if (command.equals("pop")) {
                sb.append(stack.isEmpty() ? -1 : stack.pop() ).append("\n");
            } else{
                int no = Integer.parseInt(command.split(" ")[1]);
                stack.add(no);
            }
        }
        System.out.println(sb);
    }


}