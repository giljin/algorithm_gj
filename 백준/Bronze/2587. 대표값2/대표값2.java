import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] nums = new int[n];
        int avg = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            avg += nums[i];
        }
        avg /= n;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(nums[i] > nums[j]){
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }

        System.out.println( avg );
        System.out.println( nums[n/2] );
    }

}