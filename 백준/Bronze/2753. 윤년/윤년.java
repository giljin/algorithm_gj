import java.util.Scanner;
interface Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        
        System.out.println( isLeapYear(year) ? "1" : "0");
    }
    
    public static boolean isLeapYear(int year){
        if( year % 4 > 0 ){
            return false;
        }
        
        if( year % 100 > 0 ){
            return true;
        }
        
        if( year % 400 == 0 ){
            return true;
        }
        
        return false;
    }
}