import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        List<Integer> queue = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        int head = 0;
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());


            int prevHead = head;
            int leftCount = 0;
            //left
            while (queue.get(head) != num){
                head++;
                if( head == queue.size() ){
                    head = 0;
                }
                leftCount++;
            }

            head = prevHead;
            int rightCount = 0;
            //right
            while (queue.get(head) != num){
                head--;
                if( head == -1 ){
                    head = queue.size()-1;
                }
                rightCount++;
            }
            queue.remove(head);

            if( head >= queue.size() ){
                head = 0;
            }
            count += Math.min(leftCount, rightCount);
        }

        System.out.println(count);
    }
}