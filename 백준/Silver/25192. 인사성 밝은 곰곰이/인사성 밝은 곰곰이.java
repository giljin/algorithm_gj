import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();

        int n = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < n; i++) {
            String chat = br.readLine();
            if( chat.equals("ENTER") ){
                set.clear();
            }else{
                if( set.add(chat) ){
                    result++;
                }
            }
        }
        System.out.println(result);
    }


}