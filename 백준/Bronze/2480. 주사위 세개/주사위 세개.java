import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> dices = new ArrayList<>();
        int sameDice = 0;
        int sameCount = 0;
        for (int i = 0; i < 3; i++) {
            int dice = scanner.nextInt();
            if( dices.contains(dice) ){
                sameCount++;
                sameDice = dice;
            }
            dices.add(dice);
        }

        if( sameCount < 1 ){
            int maxDice = 0;
            for (int i = 0; i <dices.size(); i++) {
                if( dices.get(i) > maxDice ){
                    maxDice = dices.get(i);
                }
            }
            int reword = maxDice * 100;
            System.out.println(reword);
        }else{
            int reward = 1000 * ((int)Math.pow(10, sameCount-1)) + (sameDice * 100 * (int)Math.pow(10, sameCount-1) );
            System.out.println(reward);
        }
    }
}