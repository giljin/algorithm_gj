import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> queue = new LinkedList<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String command = br.readLine();
            if( command.indexOf("push") > -1 ){
                String[] pushCommand = command.split(" ");
                queue.push(Integer.parseInt(pushCommand[1]));
            }else if( command.equals("back") ){
                int no = -1;
                if ( !queue.isEmpty() ) {
                    no = queue.get(0);
                }
                sb.append(no).append("\n");
            }else if( command.equals("front") ){
                int no = -1;
                if ( !queue.isEmpty() ) {
                    no = queue.get(queue.size()-1);
                }
                sb.append(no).append("\n");
            }else if( command.equals("size") ){
                sb.append(queue.size()).append("\n");
            }else if( command.equals("empty") ){
                int value = 0;
                if( queue.isEmpty() ){
                    value = 1;
                }
                sb.append(value).append("\n");
            }else if( command.equals("pop") ){
                if( queue.isEmpty() ){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(queue.remove(queue.size()-1)).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}