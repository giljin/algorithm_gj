import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        int lastNo = -1;
        for (int i = 0; i < n; i++) {
            String command = br.readLine();
            if( command.equals("pop") ){
                if (q.isEmpty()){
                    sb.append("-1\n");
                }else{
                    sb.append(q.poll()).append("\n");
                }
            }else if( command.equals("size") ){
                sb.append(q.size()).append("\n");
            }else if( command.equals("empty") ){
                sb.append(q.isEmpty() ? 1 : 0).append("\n");
            }else if( command.equals("front") ){
                sb.append( q.isEmpty() ? -1 : q.peek() ).append("\n");
            }else if( command.equals("back") ){
                sb.append( q.isEmpty() ? -1 : lastNo ).append("\n");
            }else {
                int no = Integer.parseInt(command.split(" ")[1]);
                q.add(no);
                lastNo = no;
            }
        }
        System.out.println(sb);
    }
}