import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        TreeMap<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (word.length() >= m ){
                if( map.containsKey(word) ){
                    map.put(word, map.get(word) + 1);
                }else{
                    map.put(word, 1);
                }
            }
        }
        List<String> result = map.entrySet()
                .stream()
                .sorted((a,b) ->{
                    if( a.getValue() == b.getValue() ){
                        if( a.getKey().length() == b.getKey().length() ){
                            return b.getKey().compareTo(a.getKey());
                        }
                        return a.getKey().length() - b.getKey().length();
                    }
                    return a.getValue() - b.getValue();
                })
                .map(a -> a.getKey())
                .collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();
        for (int i = result.size()-1; i >= 0; i--) {
            sb.append(result.get(i)).append("\n");
        }
        System.out.println(sb);
    }


}