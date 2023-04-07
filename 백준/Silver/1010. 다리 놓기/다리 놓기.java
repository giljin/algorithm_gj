import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            BigInteger n = sc.nextBigInteger();
            BigInteger m = sc.nextBigInteger();
            if (n.equals(m)){
                System.out.println(1);
            }else{
                System.out.println(fact(m).divide(fact(m.subtract(n))).divide(fact(n)));
            }
        }
    }

    public static BigInteger fact(BigInteger n) {
        BigInteger one = BigInteger.valueOf(1);
        if (n.compareTo(one) <= 0){
            return n;
        }else{
            return fact(n.subtract(one)).multiply(n);
        }
    }
}