import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        final String IMPASSABLE_MESSAGE = "I'm Sorry Hansoo";

        int[] counts = new int[26];
        for (int i = 0; i < name.length(); i++) {
            counts[name.charAt(i)-'A'] += 1;
        }

        int n = 0, mid = 0;
        for(int i = 0; i < 26; i++) {
            if(counts[i] % 2 == 1) {
                mid = i;
                n++;
            }
        }

        if((name.length() % 2 == 1 && n > 1) || (name.length() % 2 == 0 && n > 0)) {
            System.out.println(IMPASSABLE_MESSAGE);
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < counts[i]/2; j++) {
                sb.append((char)(i+'A'));
            }
        }
        StringBuilder sb2 = new StringBuilder(sb);
        if( name.length() % 2 == 1){
            sb.append((char)(mid+'A'));
        }
        sb.append(sb2.reverse());
        System.out.println(sb);

    }

}