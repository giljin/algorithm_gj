import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        while ((input = br.readLine()) != null){
            int n = Integer.parseInt(input);
            String[] arr = new String[(int)Math.pow(3,n)];
            cantor(arr, 0, arr.length-1);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i] == null ? " " : arr[i]);
            }
            System.out.println(sb);
        }
    }
    public static void cantor(String[] a, int s, int e){
        int length = e-s;
        if( length > 2 ){
            int div =  (e-s+1)/3;
            cantor(a, s, s+div-1);
            cantor(a, div+div+s, e);
        }else{
            a[s] = "-";
            a[e] = "-";
        }
    }
}