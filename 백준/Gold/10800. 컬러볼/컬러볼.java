import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Ball[] balls = new Ball[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Ball ball = new Ball(i, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            balls[i] = ball;
        }
        Arrays.sort(balls, Comparator.comparingInt(b -> b.size));

        int[] color = new int[n+1];
        int[] answer = new int[n];
        int sum = 0;
        int smallSizeIndex = 0;
        for (int i = 0; i < balls.length; i++) {
            Ball ball = balls[i];

            while (balls[smallSizeIndex].size < ball.size){
                sum += balls[smallSizeIndex].size;
                color[balls[smallSizeIndex].color] += balls[smallSizeIndex].size;
                smallSizeIndex++;
            }

            answer[ball.index] = sum - color[ball.color];

        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < answer.length; i++) {
            sb.append(answer[i]).append("\n");
        }
        System.out.println(sb);
    }

    public static class Ball{
        private int index;
        private int color;
        private int size;

        public Ball(int index, int color, int size){
            this.index = index;
            this.color = color;
            this.size = size;
        }
    }


}