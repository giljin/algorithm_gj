import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            System.out.println(isPalindrome(word));
        }
    }

    public static String isPalindrome(String word){
        return recursion(word.split(""), 0, word.length()-1, 0);
    }

    public static String recursion(String[] chars, int front, int back, int count){
        count++;
        if( front >= back ){
            return 1 + " " + count;
        }else if( !chars[front].equals(chars[back]) ){
            return 0 + " " + count;
        }

        return recursion(chars, front+1, back-1, count);
    }

}