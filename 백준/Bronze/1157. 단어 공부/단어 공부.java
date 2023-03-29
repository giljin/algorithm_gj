import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        String lowerAlphabets = scanner.nextLine().toLowerCase();
        String[] alphabetArray = lowerAlphabets.split("");
        Map<String, Integer> map = new HashMap<>();
        for (String alphabet : alphabetArray){
            map.put(alphabet, map.get(alphabet) == null ? 1 : map.get(alphabet) + 1);
        }

        int max = 0;
        for(int count: map.values()){
            if( count > max ){
                max = count;
            }
        }

        String result = "";
        for (String alpha : map.keySet()){
            if( map.get(alpha).intValue() == max ){
                if( !result.isEmpty() ){
                    result = "?";
                    break;
                }else{
                    result = alpha;
                }
            }
        }
        System.out.println(result.toUpperCase());
    }
}