import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int xMin = w-x;
        if( x < xMin ){
            xMin = x;
        }
        int yMin = h-y;
        if( y < yMin ){
            yMin = y;
        }
        System.out.println( xMin > yMin ? yMin : xMin);
    }
}