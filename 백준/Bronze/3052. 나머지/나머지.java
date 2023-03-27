import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> remainSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            remainSet.add(scanner.nextInt() % 42);
        }
        System.out.println(remainSet.size());
    }
}