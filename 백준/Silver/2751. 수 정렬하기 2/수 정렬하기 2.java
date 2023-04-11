import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }
        Collections.sort(nums);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < nums.size(); i++) {
            result.append(nums.get(i) + "\n");
        }
        System.out.println(result);
    }

}