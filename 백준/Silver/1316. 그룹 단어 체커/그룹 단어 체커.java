import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        int count = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < count; i++) {
            String word = scanner.next();
            if( checkGroupWord(word) ){
                result++;
            }
        }
        System.out.println(result);
    }
    public static boolean checkGroupWord(String word){
        for (int j=0; j<word.length()-1; j++){
            boolean isChange = false;
            for (int k=j+1; k<word.length(); k++){
                if( word.charAt(j) != word.charAt(k) ){
                    isChange = true;
                }else if( isChange ){
                    return false;
                }
            }
        }
        return true;
    }
}