import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            String[] values = scanner.nextLine().split(" ");
            int copyCount = Integer.parseInt(values[0]);
            String word = values[1];

            for (int k = 0; k < word.length(); k++) {
                for (int j = 0; j < copyCount; j++) {
                    System.out.print(word.charAt(k));
                }
            }
            System.out.println();
        }
    }
}