import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] k = new int[n];
        k[0] = scanner.nextInt();
        for (int i=1; i<k.length; i++){
            k[i] = scanner.nextInt() + k[i-1];
        }

        for (int o = 0; o < m; o++) {
            int i = scanner.nextInt()-1;
            int j = scanner.nextInt()-1;
            if( i == 0 ){
                System.out.println(k[j]);
            }else{
                System.out.println(k[j]-k[i-1]);
            }
        }
    }
}