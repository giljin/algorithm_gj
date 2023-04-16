import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            long a = Long.parseLong(br.readLine())-1;
            while (!isPrimeNumber(++a));
            sb.append(a).append("\n");
        }
        System.out.println(sb);
    }

    public static boolean isPrimeNumber(long no){
        if(no < 2){
            return false;
        }
        if(no == 2){
            return true;
        }
        for(long i=2; i<=Math.sqrt(no); i++){
            if(no % i == 0) {
                return false;
            }
        }
        return true;
    }
}
;