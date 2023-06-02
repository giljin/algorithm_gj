import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine() + "2";

        int[] counts = new int[2];
        int startNum = S.charAt(0)-48;
        for (int i = 1; i < S.length(); i++) {
            int num = S.charAt(i)-48;
            if( startNum != num ){
                counts[startNum] = counts[startNum]+1;
                startNum = num;
            }
        }
        System.out.println(Math.min(counts[0], counts[1]));
    }
}