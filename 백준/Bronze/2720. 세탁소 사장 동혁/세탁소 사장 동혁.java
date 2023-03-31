import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        int[] changes = {25, 10, 5, 1};
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int change = scanner.nextInt();
            for (int j = 0; j < changes.length; j++) {
                System.out.print(change / changes[j] + " ");
                change %= changes[j];
            }
        }

    }

}