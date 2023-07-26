import java.util.*;
import java.util.regex.Pattern;

class Solution {
    public String[] solution(String[] files) {
        String[] answer = new String[files.length];

        List<File> list = new ArrayList<>();
        for(String file : files){
            boolean isNumber1 = false;

            int startNumberIndex = -1;
            int endNumberIndex = file.length();
            for (int i = 0; i < file.length(); i++) {
                boolean isNumber2 = Pattern.matches("^[0-9]*$", file.charAt(i)+"");
                if( !isNumber1 && isNumber2 ){
                    startNumberIndex = i;
                }
                if( isNumber1 && !isNumber2){
                    endNumberIndex = i;
                    break;
                }
                isNumber1 = isNumber2;
            }

            String head = file.substring(0, startNumberIndex);
            String number = file.substring(startNumberIndex, endNumberIndex);
            String tail = file.substring(endNumberIndex);
            list.add(new File(head, number, tail));
        }

        Collections.sort(list, (o1, o2) -> {

            String lowerHead1 = o1.head.toLowerCase();
            String lowerHead2 = o2.head.toLowerCase();
            if (!lowerHead1.equals(lowerHead2)) {
                return lowerHead1.compareTo(lowerHead2);
            }
            int num1 = Integer.parseInt(o1.number);
            int num2 = Integer.parseInt(o2.number);
            if (num1 != num2) {
                return num1 - num2;
            }

            return 0;
        });

        for (int i = 0; i < list.size(); i++) {
            File file = list.get(i);
            answer[i] = file.head + file.number + file.tail;
        }

        return answer;
    }
    
    class File{
        String head;
        String number;
        String tail;

        public File(String head, String number, String tail){
            this.head = head;
            this.number = number;
            this.tail = tail;
        }
    }
}