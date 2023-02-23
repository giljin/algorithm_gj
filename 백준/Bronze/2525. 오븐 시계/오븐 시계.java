import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int interval = scanner.nextInt();
        int time = hour * 60 + minute + interval % 1440;
        System.out.println(time/60%24 + " " + time%60);
    }

}