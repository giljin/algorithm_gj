import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        minute -= 45;
        if( minute < 0 ){
            hour--;
            minute += 60;
        }
        
        if( hour < 0 ){
            hour = 23;
        }
        System.out.println(hour + " " + minute);
    }
    
}