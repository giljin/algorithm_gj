import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = "";
        while (!( a = br.readLine()).equals(".")){
            Stack<String> stack = new Stack<>();
            for (int i = 0; i < a.length(); i++) {
                if( a.charAt(i) == ')' ){
                    if( stack.isEmpty() ){
                        stack.add(a.charAt(i) + "");
                        break;
                    }else{
                        if( stack.get(stack.size()-1).equals("(") ){
                            stack.pop();
                        }else{
                            break;
                        }
                    }
                }else if( a.charAt(i) == ']') {
                    if( stack.isEmpty() ){
                        stack.add(a.charAt(i)+"");
                        break;
                    }else{
                        if( stack.get(stack.size()-1).equals("[") ){
                            stack.pop();
                        }else{
                            break;
                        }
                    }
                }else if( a.charAt(i) == '(' || a.charAt(i) == '['){
                    stack.add(a.charAt(i)+"");
                }
            }
            System.out.println( stack.size() == 0 ? "yes" : "no");
        }


    }


}