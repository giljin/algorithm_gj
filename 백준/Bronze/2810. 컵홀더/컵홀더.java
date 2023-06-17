import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String str = "";
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'S') {
                str += "*S";
            } else {
                str += "*LL";
                i++;
            }
        }
        str += "*";  //마지막 자리에 * 추가
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') count++;
        }
        count = Math.min(count, n);
        System.out.print(count);
    }
}