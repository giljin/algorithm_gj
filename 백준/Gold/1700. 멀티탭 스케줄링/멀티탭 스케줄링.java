import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int[] multiTab;
    private static int[] counts;
    private static int[] items;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        items = new int[m];
        multiTab = new int[n];
        counts = new int[m+1];

        StringTokenizer itemTokenizer = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            items[i] = Integer.parseInt(itemTokenizer.nextToken());
            counts[items[i]]++;
        }

        int result = 0;
        for (int i = 0; i < m; i++) {
            counts[items[i]]--;

            if( isPlugInItem(items[i]) ){
                continue;
            }

            int emptyMultiTabIndex = findEmptyMultiTabHole();
            if( emptyMultiTabIndex >= 0 ){
                multiTab[emptyMultiTabIndex] = items[i];
                continue;
            }

            //뽑기
            result++;
            int unusedIndex = findUnusedItemIndex();
            if( unusedIndex >= 0 ){
                multiTab[unusedIndex] = items[i];
                continue;
            }

            //가장 마지막에 쓰이는 아이템 뽑기
            int maxIndex = -1;
            int multiTabIndex = 0;
            for (int j = 0; j < multiTab.length; j++) {
                int item = multiTab[j];
                for (int k = i+1; k < m; k++) {
                    if( items[k] == item ){
                        if( maxIndex < k ){
                            maxIndex = k;
                            multiTabIndex = j;
                        }
                        break;
                    }
                }
            }
            multiTab[multiTabIndex] = items[i];
        }
        System.out.println(result);
    }

    public static boolean isPlugInItem(int item){
        for (int i = 0; i < multiTab.length; i++) {
            if( multiTab[i] == item ){
                return true;
            }
        }
        return false;
    }
    public static int findEmptyMultiTabHole(){
        for (int j = 0; j < multiTab.length; j++) {
            if( multiTab[j] == 0 ){
                return j;
            }
        }
        return -1;
    }
    public static int findUnusedItemIndex(){
        for (int i = 0; i < multiTab.length; i++) {
            if( counts[multiTab[i]] == 0 ){
                return i;
            }
        }
        return -1;
    }
}