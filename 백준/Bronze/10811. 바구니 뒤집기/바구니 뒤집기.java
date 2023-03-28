import java.util.*;

public class Main {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int basketCount = scanner.nextInt();
        int[] baskets = new int[basketCount];
        for (int i = 0; i < basketCount; i++) {
            baskets[i] = i+1;
        }
        int chageCount = scanner.nextInt();
        for (int i = 0; i < chageCount; i++) {
            int startNum = scanner.nextInt();
            int endNum = scanner.nextInt();
            int[] copyBaskets = baskets.clone();
            for (int j = startNum; j <= endNum; j++) {
                baskets[j-1] = copyBaskets[endNum-(j-startNum+1)];
            }
        }
        for (int k = 0; k < baskets.length; k++) {
            System.out.print(baskets[k] + " ");
        }

    }
}