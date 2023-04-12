import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] rank = new int[n];
        int[] origin = new int[n];
        for (int i=0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            rank[i] = num;
            origin[i] = num;
        }
        Arrays.sort(rank);

        HashMap<Integer, Integer> map = new HashMap<>();
        int ranking= 0;
        for(int num : rank){
            if(!map.containsKey(num)){
                map.put(num, ranking);
                ranking++;
            }
        }

        StringBuilder builder = new StringBuilder();
        for (int num : origin){
            builder.append(map.get(num)).append(" ");
        }
        System.out.println(builder);
    }
}