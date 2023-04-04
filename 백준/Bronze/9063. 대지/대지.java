import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        int count = scanner.nextInt();
        int minX = 100001;
        int maxX = -100001;
        int minY = 100001;
        int maxY = -100001;
        while (count-- > 0){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            maxX = Math.max(maxX, x);
            minX = Math.min(minX, x);
            maxY = Math.max(maxY, y);
            minY = Math.min(minY, y);
        }

        System.out.println((maxX-minX) * (maxY-minY));
    }
}