import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = br.readLine();
        int i=0;
        while ( inputString.length() >= 10 ){
            System.out.println( inputString.substring(0, 10) );
            inputString = inputString.substring(10);
        }
        System.out.println(inputString);
    }

}
