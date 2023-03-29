import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        String[] croatiaLanguages = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String word = scanner.nextLine();
        int result = 0;
        for (String croatiaLanguage : croatiaLanguages){
            word = word.replaceAll(croatiaLanguage, " ");
        }
        result += word.length();
        System.out.println(result);
    }
}