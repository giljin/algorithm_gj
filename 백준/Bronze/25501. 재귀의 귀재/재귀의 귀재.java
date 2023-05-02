import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            System.out.println(isPalindrome(word,0, word.length()-1));
            cnt = 0;
        }
    }

    public static String isPalindrome(String word, int s, int e) {
        cnt++;
        if( s >= e ){
            return "1 " + cnt;
        }
        if( word.charAt(s) != word.charAt(e) ){
            return "0 " + cnt;
        }
        return isPalindrome(word, s+1, e-1);
    }
}