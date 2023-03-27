import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int maxIndex = 0;
        for(int i=0; i<9; i++){
            int num = Integer.parseInt(reader.readLine());
            if( num > max ){
                max = num;
                maxIndex = i;
            }
        }
        System.out.println(max);
        System.out.println((maxIndex+1));
    }
}