import java.util.*;
public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        int[] pieceCounts = {1,1,2,2,2,8};
        for (int pieceCount : pieceCounts){
            System.out.print(pieceCount - scanner.nextInt());
            System.out.print(" ");
        }
    }
}