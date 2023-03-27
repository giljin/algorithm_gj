import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0; i<count; i++){
            String[] nums = br.readLine().split(" ");
            bw.write(Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]) + "\n");
        }
        bw.flush();
    }
}