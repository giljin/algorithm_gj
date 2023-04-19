import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();
        set.add("ChongChong");

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] names = br.readLine().split(" ");
            if( set.contains(names[0]) ){
                set.add(names[1]);
            }else if( set.contains(names[1]) ){
                set.add(names[0]);
            }
        }

        System.out.println(set.size());
    }


}