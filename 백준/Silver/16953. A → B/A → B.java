import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long startNum = Long.parseLong(st.nextToken());
        long targetNum = Long.parseLong(st.nextToken());

        Queue<long[]> queue = new LinkedList<>();
        queue.add(new long[]{startNum, 1});

        long result = -1;
        while (!queue.isEmpty()){
            long[] num = queue.poll();

            long multiple = num[0] * 2;
            if( multiple == targetNum ){
                result = num[1]+1;
                break;
            }

            if( multiple < targetNum ){
                queue.add(new long[]{multiple, num[1]+1});
            }


            long lastOneAdd = num[0] * 10 + 1;
            if( lastOneAdd == targetNum ){
                result = num[1]+1;
                break;
            }

            if( lastOneAdd < targetNum ){
                queue.add(new long[]{lastOneAdd, num[1]+1});
            }
        }
        System.out.println(result);

    }
}