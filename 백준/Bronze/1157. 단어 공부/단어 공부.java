import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        String upperCaseAlphabets = scanner.nextLine().toUpperCase();
        int[] counts = new int[26];
        int maxCount = 0, maxNo = 0;
        for (int i=0; i<upperCaseAlphabets.length(); i++){
            int x = upperCaseAlphabets.charAt(i);
            counts[x-65]++;

            if( counts[x-65] > maxCount ){
                maxNo = x;
                maxCount = counts[x-65];
            }else if( counts[x-65] == maxCount ){
                maxNo = 63;
            }
        }

        System.out.println((char) maxNo);
    }
}