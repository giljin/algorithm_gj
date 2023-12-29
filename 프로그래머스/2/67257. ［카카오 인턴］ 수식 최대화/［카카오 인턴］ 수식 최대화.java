import java.util.*;
class Solution {
    
    public long solution(String expression) {
        long answer = 0;

        List<Long> numbers = findNumbers(expression);
        List<String> operators = findOperators(expression);
        
        String[][] calculateOrders = {
            {"+", "-", "*"}, 
            {"+", "*", "-"},
            {"-", "+", "*"},
            {"-", "*", "+"},
            {"*", "-", "+"},
            {"*", "+", "-"}
        };
        
        for(int i=0; i<calculateOrders.length; i++){
            long result = 0;
            result = calculate(calculateOrders[i], numbers, operators);
            answer = Math.max(answer, Math.abs(result));
        }
        
        return answer;
    }
    public Long calculate(String[] calculateOrder, List<Long> numbers, List<String> operators){
        List<Long> cpNumbers = new ArrayList<>(numbers);
        List<String> cpOperators = new ArrayList<>(operators);
        
        for(String operator : calculateOrder){
            while(cpOperators.contains(operator)){
                int findOperatorIndex = cpOperators.indexOf(operator);
                cpOperators.remove(findOperatorIndex);
                
                long a = cpNumbers.get(findOperatorIndex);
                long b = cpNumbers.remove(findOperatorIndex + 1);
                
                if(operator.equals("+")){
                    cpNumbers.set(findOperatorIndex, a + b);
                }else if(operator.equals("-")){
                    cpNumbers.set(findOperatorIndex, a - b);
                }else{
                    cpNumbers.set(findOperatorIndex, a * b);
                }
            }
        }
        
        return cpNumbers.get(0);
    }
    
    public List<Long> findNumbers(String expression){
        List<Long> numbers = new ArrayList<>();
        
        String temp = "";
        for(int i=0; i<expression.length(); i++){
            char findChar = expression.charAt(i);
            if(findChar == '+' || findChar == '-' || findChar == '*'){
                Long number = Long.parseLong(temp);
                numbers.add(number);
                temp = "";
                continue;
            }

            temp += findChar;
        }
        
        Long number = Long.parseLong(temp);
        numbers.add(number);
        return numbers;
    }
    
    public List<String> findOperators(String expression){
        List<String> operators = new ArrayList<>();
        
        for(int i=0; i<expression.length(); i++){
            char findChar = expression.charAt(i);
            if (findChar == '+'){
                operators.add("+");
            }else if (findChar == '-'){
                operators.add("-");
            }else if (findChar == '*'){
                operators.add("*");
            }
        }
        return operators;
    }
}