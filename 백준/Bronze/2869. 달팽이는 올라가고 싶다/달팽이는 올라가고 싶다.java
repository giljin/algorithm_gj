import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        double V = scanner.nextDouble();
        int days = (int)Math.ceil((V - A) / (A - B)) + 1;
        System.out.println(days);
    }
}
