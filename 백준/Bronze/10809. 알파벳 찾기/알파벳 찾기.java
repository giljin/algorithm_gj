import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        for (int i = 0; i < 26; i++) {
            System.out.print(word.indexOf(i+97) + " ");
        }
    }
}