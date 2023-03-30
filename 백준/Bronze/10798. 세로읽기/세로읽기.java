import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        List<String> words = new ArrayList<>();
        int maxLength = -1;
        for (int i = 0; i < 5; i++) {
            String word = scanner.nextLine();
            if( word.length() > maxLength ){
                maxLength = word.length();
            }
            words.add(word);
        }

        String result = "";
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < words.size(); j++) {
                String word = words.get(j);
                if( word.length() <= i ){
                    continue;
                }
                result += word.charAt(i);
            }
        }
        System.out.println(result);
    }

}