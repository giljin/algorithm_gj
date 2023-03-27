import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[30];
        for (int i = 1; i <= 30; i++) {
            nums[i-1] = i;
        }
        for (int i = 0; i < 28; i++) {
            int num = scanner.nextInt();
            nums[num-1] = 0;
        }

        for (int i = 0; i < nums.length; i++) {
            if( nums[i] > 0 ){
                System.out.println(nums[i]);
            }
        }
    }
}