import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = br.readLine();
        StringTokenizer st = new StringTokenizer(result, ".");

        final String AAAA = "AAAA";
        final String BB = "BB";

        while (st.hasMoreTokens()){
            String x = st.nextToken();
            if( x.length() % 2 != 0 ){
                result = "-1";
                break;
            }

            String polyomino = AAAA.repeat(x.length()/4) + BB.repeat(x.length()%4/2);
            result = result.replaceFirst(x, polyomino);
        }
        System.out.println(result);
    }
}