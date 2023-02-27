import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int totalPrice = scanner.nextInt();
        int count = scanner.nextInt();
        
        int price = 0;
        for(int i=0; i<count; i++){
            price += scanner.nextInt() * scanner.nextInt();
        }
        
        System.out.println(totalPrice == price ? "Yes" : "No");
        
    }
}