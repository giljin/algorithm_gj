import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        for(int i=0; i<t; i++){
            String word = scanner.nextLine();
            System.out.println(word.charAt(0) + "" + word.charAt(word.length()-1));
        }
    }
}