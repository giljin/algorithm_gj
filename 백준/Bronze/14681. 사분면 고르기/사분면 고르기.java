import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(getQuadrant(x,y));
    }
    
    static int getQuadrant(int x, int y){
        if( x > 0 && y > 0 ){
            return 1;
        }
        
        if( x > 0 ){
            return 4;
        }
        
        if( y > 0 ){
            return 2;
        }
        
        return 3;
    }
}