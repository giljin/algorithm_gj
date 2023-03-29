import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        char[] spellings = scanner.nextLine().toCharArray();
        int result = 1;
        for (int i = 0; i < spellings.length/2; i++) {
            if( spellings[i] != spellings[spellings.length-1-i]){
                result = 0;
                break;
            }
        }
        System.out.println(result);
    }
}