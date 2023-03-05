import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        for(int i=1; i<=row; i++){
            for(int j=0; j<row-i; j++){
                System.out.print(" ");
            }

            for(int k=0; k<i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}