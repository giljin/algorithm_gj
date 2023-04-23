import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String command = br.readLine();
            if( command.equals("back") ){
                sb.append(deque.isEmpty() ? -1 : deque.getLast()).append("\n");
            }else if( command.equals("front") ){
                sb.append(deque.isEmpty() ? -1 : deque.getFirst()).append("\n");
            }else if( command.equals("empty") ){
                sb.append(deque.isEmpty() ? 1 : 0).append("\n");
            }else if( command.equals("size") ){
                sb.append(deque.size()).append("\n");
            }else if( command.equals("pop_back") ){
                sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append("\n");
            }else if( command.equals("pop_front") ){
                sb.append(deque.isEmpty() ? -1 : deque.pollFirst()).append("\n");
            }else if( command.indexOf("back") > -1 ){
                deque.addLast(Integer.parseInt(command.split(" ")[1]));
            }else{
                deque.addFirst(Integer.parseInt(command.split(" ")[1]));
            }
        }

        System.out.println(sb);
    }

}
