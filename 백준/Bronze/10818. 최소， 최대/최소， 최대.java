import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        String[] nums = reader.readLine().split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<count; i++){
            int num = Integer.parseInt(nums[i]);
            if( num > max ){
                max = num;
            }
            if( num < min ){
                min = num;
            }
        }
        System.out.println(min + " " + max);
    }
}