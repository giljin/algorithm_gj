import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String commands = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String nums = br.readLine();
            StringTokenizer st = new StringTokenizer(nums.substring(1, nums.length()-1), ",");
            Deque<String> deque = new ArrayDeque<>();
            for (int j = 0; j < n; j++) {
                deque.addLast(st.nextToken());
            }

            boolean isError = false;
            int direction = 1;
            for(String command : commands.split("")){
                if( command.equals("D") ){
                    String poll = "";
                    if( direction > 0 ){
                        poll = deque.pollFirst();
                    }else{
                        poll = deque.pollLast();
                    }
                    if ( poll == null || poll.trim().isEmpty() ){
                        isError = true;
                    }
                }else{
                    direction *= -1;
                }
            }

            if( isError ) {
                System.out.println("error");
            }else{
                int size = deque.size();
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                if( direction > 0 ){
                    for (int j = 0; j < size; j++) {
                        sb.append(deque.pollFirst()).append(",");
                    }
                }else{
                    for (int j = 0; j < size; j++) {
                        sb.append(deque.pollLast()).append(",");
                    }
                }
                if( sb.length() > 1 ){
                    sb.deleteCharAt(sb.length()-1);
                }  
                sb.append("]");
                System.out.println(sb);
            }
        }
    }
}