import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int index = scanner.nextInt();
        System.out.println(text.charAt(index-1));
    }
}