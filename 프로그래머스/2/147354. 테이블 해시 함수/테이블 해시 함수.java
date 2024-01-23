import java.util.*;
class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        int colIndex = col-1;
        int tupleCount = row_end-row_begin+1;
        int[] mods = new int[tupleCount];
        
        //정렬
        Arrays.sort(data, new Comparator<int[]>() { 
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[colIndex] != o2[colIndex] ? o1[colIndex]-o2[colIndex] : o2[0]-o1[0];
            }
        });
        
        for(int i=0; i<tupleCount; i++) {
            for(int j=0; j<data[0].length; j++){
                mods[i] += data[i+row_begin-1][j] % (i+row_begin);
            }
            System.out.println(mods[i]);
        }
        
        answer = mods[0];
        for(int i=1; i<mods.length; i++){
            answer ^= mods[i];
        }
        
        
        return answer;
    }
}