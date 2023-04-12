import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        TreeMap<String, String> map = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            String[] card = br.readLine().split(" ");
            map.put(card[0], card[1]);
        }

        StringBuilder sb = new StringBuilder();
        for (String name : map.keySet()){
            if( map.get(name).equals("enter") ) {
                sb.append(name).append("\n");
            }
        }
        System.out.println(sb);
    }

}