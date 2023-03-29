import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        int testCount = scanner.nextInt();
        for(int i=0; i<testCount; i++){
            int studentCount = scanner.nextInt();
            int total = 0;
            int[] scores = new int[studentCount];
            for (int j = 0; j < studentCount; j++) {
                int score = scanner.nextInt();
                total += score;
                scores[j] = score;
            }
            int average = total / studentCount;

            double topStudentCount = 0;
            for (int score : scores){
                if (score > average){
                    topStudentCount++;
                }
            }
            double persent = topStudentCount / studentCount;
            System.out.println(String.format("%.3f", persent * 100) + "%");
        }
    }
}