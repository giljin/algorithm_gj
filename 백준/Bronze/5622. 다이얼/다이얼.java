import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        String[] alphabets = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        String[] spellings = scanner.nextLine().split("");
        int result = 0;
        for (String spelling : spellings){
            for (int i=0; i<alphabets.length; i++ ){
                if( alphabets[i].contains(spelling) ){
                    result += i + 2;
                }
            }
        }
        System.out.println(result + spellings.length);
    }
}