import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int result = 0;
        if( n == 1 ){
            result = 1;
        }else if( n == 2 ){
            result = Math.min((m+1)/2, 4);
        }else {
            if( m < 7 ){
                result = Math.min(m, 4);
            }else{
                result = m-2;
            }
        }
        System.out.println(result);
    }
}