import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        Map<String, Double> subjectGrade = new HashMap<>();
        subjectGrade.put("A+", 4.5);
        subjectGrade.put("A0", 4.0);
        subjectGrade.put("B+", 3.5);
        subjectGrade.put("B0", 3.0);
        subjectGrade.put("C+", 2.5);
        subjectGrade.put("C0", 2.0);
        subjectGrade.put("D+", 1.5);
        subjectGrade.put("D0", 1.0);
        subjectGrade.put("F", 0.0);
        subjectGrade.put("P", 0.0);

        double result = 0;
        double totalCredit = 0;
        for (int i = 0; i < 20; i++) {
            String name = scanner.next();
            double credit = scanner.nextDouble();
            String grade = scanner.next();
            if (grade.equals("P")){
                continue;
            }
            result += credit * subjectGrade.get(grade);
            totalCredit += credit;
        }
        System.out.println(result / totalCredit);
    }

}