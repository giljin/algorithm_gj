import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Map<String, String> parking = new HashMap<>();

        Map<String, Integer> times = new HashMap<>();
        for (int i = 0; i < records.length; i++) {
            String[] record = records[i].split(" ");

            String time = record[0];
            String car = record[1];
            String type = record[2];

            if( type.equals("IN") ){
                parking.put(car, time);
                continue;
            }

            String inTime = parking.remove(car);
            int parkingTime = calculateDiffTimeMinute(sdf, inTime, time);

            if( times.containsKey(car) ){
                parkingTime += times.get(car);
            }

            times.put(car, parkingTime);
        }

        for(String car : parking.keySet()){
            String inTime = parking.get(car);
            String outTime = "23:59";
            int parkingTime = calculateDiffTimeMinute(sdf, inTime, outTime);
            if( times.containsKey(car) ){
                parkingTime += times.get(car);
            }
            times.put(car, parkingTime);
        }

        int[] answer = new int[times.size()];
        int i = 0;
        String[] timeKeySet = times.keySet().toArray(new String[0]);
        Arrays.sort(timeKeySet);
        for (String car : timeKeySet){
            int time = times.get(car);
            int price = fees[1];

            if( fees[0] < time ){
                int addTime = time - fees[0];
                int addPrice = (int)(Math.ceil(addTime / (fees[2] * 1.0)) * fees[3]);
                price += addPrice;
            }
            answer[i++] = price;
        }
        return answer;
    }
    public int calculateDiffTimeMinute(SimpleDateFormat sdf, String timeStr1, String timeStr2) throws ParseException {
        // 문자열 -> Date
        Date date1 = sdf.parse(timeStr1);
        Date date2 = sdf.parse(timeStr2);

        // Date -> 밀리세컨즈
        long timeMil1 = date1.getTime();
        long timeMil2 = date2.getTime();

        // 비교
        long diff = timeMil2 - timeMil1;
        return (int)(diff / (1000 * 60));
    }
}