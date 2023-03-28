import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int max = 0;
        int sum = 0;
        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            sum += num;
            if( num > max ){
                max = num;
            }
        }
        System.out.println(sum / (double)max * 100 / count);
    }
}