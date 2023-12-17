import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Long> q1 = arrayToQueue(queue1);
        Queue<Long> q2 = arrayToQueue(queue2);

        long sum1 = getQueueSum(q1);
        long sum2 = getQueueSum(q2);

        int answer = 0;
        int maxCount = (q1.size() + q2.size())+1;
        while (sum1 != sum2) {
            if (answer > maxCount) {
                return -1;
            }

            if (sum1 < sum2) {
                long element = q2.poll();
                q1.add(element);
                sum1 += element;
                sum2 -= element;
            } else {
                long element = q1.poll();
                q2.add(element);
                sum2 += element;
                sum1 -= element;
            }

            answer++;
        }

        return answer;  
    }
    
    public Queue<Long> arrayToQueue(int[] array) {
        Queue<Long> queue = new LinkedList<>();
        for (long number : array) {
            queue.add(number);
        }
        return queue;
    }

    public long getQueueSum(Queue<Long> queue) {
        return queue.stream()
                .reduce(Long::sum)
                .orElse(0L);
    }
}