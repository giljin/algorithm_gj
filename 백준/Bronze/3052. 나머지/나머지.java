import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> remainMap = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            remainMap.put(scanner.nextInt() % 42, 1);
        }

        System.out.println(remainMap.size());
    }
}