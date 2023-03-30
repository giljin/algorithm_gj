import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        int[][] area = new int[100][100];
        int count = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < count; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10; k++) {
                    if( area[j][k] == 0 ){
                        area[j][k] = 1;
                        result++;
                    }
                }
            }
        }

        System.out.println(result);
    }

}