import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            Stack<String> stack = new Stack<>();
            String[] psArr = br.readLine().split("");
            for( String ps : psArr ){
                if( ps.equals(")") ){
                    if( stack.isEmpty() ){
                        stack.add(ps);
                        break;
                    }else{
                        stack.pop();
                    }
                }else{
                    stack.add(ps);
                }
            }
            System.out.println( stack.size() == 0 ? "YES" : "NO");
        }
    }
}