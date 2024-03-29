import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(m == sum){
                        result = m;
                        break;
                    } else if (m > sum) {
                       if( result < sum ){
                           result = sum;
                       }
                    }
                }
            }
        }
        System.out.println(result);
    }
}