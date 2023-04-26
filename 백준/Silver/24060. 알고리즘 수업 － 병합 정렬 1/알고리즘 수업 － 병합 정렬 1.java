import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static int c = 0;
    public static int[] tmp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        tmp = new int[n];

        mergeSort(a, 0, n-1, k);
        if( k > c ){
            System.out.println(-1);
        }
    }

    public static void mergeSort(int[] a, int p, int r, int k){
        if (c > k) return ;
        if( p < r ){
            int q = (p+r)/2;
            mergeSort(a, p, q, k);
            mergeSort(a, q+1 , r, k);
            merge(a, p, q, r, k);
        }
    }

    public static void merge(int[] a, int p, int q, int r, int k){
        int i = p, j = q+1, t = 0;


        while (i <= q && j <= r){
            if( a[i] <= a[j] ){
                tmp[t++] = a[i++];
            }else{
                tmp[t++] = a[j++];
            }
        }
        while (i <= q){
            tmp[t++] = a[i++];
        }
        while (j <= r){
            tmp[t++] = a[j++];
        }

        i = p; t = 0;
        while (i <= r){
            c++;
            if( c == k ){
                System.out.println(tmp[t]);
            }
            a[i++] = tmp[t++];
        }
    }
}