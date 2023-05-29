import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split("");
        Arrays.sort(nums, Comparator.reverseOrder());

        if( !nums[nums.length-1].equals("0") ){
            System.out.println(-1);
            return;
        }

        int num = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            num += Integer.parseInt(nums[i]);
            sb.append(nums[i]);
        }

        if( num % 3 > 0 ){
            System.out.println(-1);
            return;
        }

        System.out.println(sb);
    }
}
