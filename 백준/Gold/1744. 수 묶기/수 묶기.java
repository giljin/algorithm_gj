import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> negatives = new ArrayList<>();
        ArrayList<Integer> positives = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if( num < 1 ){
                negatives.add(num);
            }else{
                positives.add(num);
            }
        }

        Collections.sort(positives, Collections.reverseOrder());
        Collections.sort(negatives);

        int result = 0;
        int i = 0;
        while (i < positives.size()) {
            if (i + 1 < positives.size() && positives.get(i) != 1 && positives.get(i + 1) != 1){
                result += positives.get(i++) * positives.get(i++);
            }else{
                result += positives.get(i++);
            }
        }

        i = 0;
        while (i < negatives.size()) {
            if (i + 1 < negatives.size()){
                result += negatives.get(i++) * negatives.get(i++);
            }else{
                result += negatives.get(i++);
            }
        }

        System.out.println(result);
    }
}
