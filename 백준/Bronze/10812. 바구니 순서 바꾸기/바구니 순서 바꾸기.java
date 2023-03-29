import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        int size = scanner.nextInt();
        int count = scanner.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = i+1;
        }

        for (int i = 0; i < count; i++) {
            int begin = scanner.nextInt()-1;
            int end = scanner.nextInt()-1;
            int mid = scanner.nextInt()-1;

            for (int j = 0; j < end - mid + 1; j++) {
                int temp = nums[end];
                for (int k = end; k > begin; k--) {
                    nums[k] = nums[k-1];
                }
                nums[begin] = temp;
            }

        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}