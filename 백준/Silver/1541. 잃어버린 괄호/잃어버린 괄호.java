import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer( br.readLine(), "-");

        int result = 0;
        StringTokenizer firstToken = new StringTokenizer(st.nextToken(), "+");
        while (firstToken.hasMoreTokens()){
            result += Integer.parseInt(firstToken.nextToken());
        }

        while (st.hasMoreTokens()){
            String minusString = st.nextToken();
            StringTokenizer plus = new StringTokenizer(minusString, "+");
            int num = 0;
            while (plus.hasMoreTokens()){
                num += Integer.parseInt(plus.nextToken());
            }
            result -= num;
        }

        System.out.println(result);

    }
}