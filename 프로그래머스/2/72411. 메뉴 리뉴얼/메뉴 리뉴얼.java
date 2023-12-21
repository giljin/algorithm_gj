import java.util.*;
import java.util.stream.Collectors;

class Solution {
    private Map<String, Integer> map = new HashMap<>();
    
    public String[] solution(String[] orders, int[] course) {
        for (int count : course) {
            for (String order : orders) {
                if (order.length() >= count) {
                    char[] chars = order.toCharArray();
                    Arrays.sort(chars);
                    order = new String(chars);
                    DFS(order, "", 0, count);
                }
            }
        }

        List<Map.Entry<String, Integer>> list = map.entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .collect(Collectors.toList());
        List<String> result = new ArrayList<>();
        for (int count : course) {
            List<Map.Entry<String, Integer>> countMatchList = list.stream()
                    .filter(e -> e.getKey().length() == count)
                    .collect(Collectors.toList());

            int max = countMatchList.stream()
                    .map(Map.Entry::getValue)
                    .max(Comparator.comparingInt(o -> o))
                    .orElse(0);

            List<String> maxList = countMatchList.stream()
                    .filter(e -> e.getValue() == max)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());

            result.addAll(maxList);
        }

        Collections.sort(result);
        int arrListSize = result.size();
        return result.toArray(new String[arrListSize]);
    }
    
    public void DFS(String str, String temp, int index, int size) {
        if (temp.length() == size) {
            int count = map.getOrDefault(temp, 0);
            map.put(temp, count + 1);
            return;
        }

        for (int i = index; i < str.length(); i++) {
            temp += str.charAt(i);
            DFS(str, temp, i + 1, size);
            temp = temp.substring(0, temp.length() - 1);
        }
    }
}