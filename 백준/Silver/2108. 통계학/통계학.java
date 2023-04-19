import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int sum = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int no = Integer.parseInt(br.readLine());
            arr[i] = no;
            sum += no;
            if( !map.containsKey(no) ){
                map.put(no, 1);
            }else{
                map.put(no, map.get(no) +1);
            }
        }

        int max = -4000;
        for (int value : map.values()) {
            if( value > max ){
                max = value;
            }
        }

        int finalMax = max;
        List<Integer> s = map.entrySet()
                .stream()
                .filter(d -> d.getValue().equals(finalMax))
                .map(et -> et.getKey())
                .sorted()
                .collect(Collectors.toList());

        Arrays.sort(arr);
        System.out.println(Math.round(sum / (n * 1.0)));
        System.out.println(arr[n/2]);
        System.out.println(s.size() > 1 ? s.get(1) : s.get(0));
        System.out.println(arr[n-1] - arr[0]);
    }


}