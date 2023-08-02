class Solution {
    static int[][] sArr;
    static int[] answer = new int[2];

    public int[] solution(int[][] arr) {
        sArr = arr;
        quad(arr.length, 0, 0);
        return answer;
    }
    void quad(int size, int x, int y){
        if( isSameNumbers(size, x, y) ){
            answer[sArr[x][y]]++;
            return;
        }
        int nextSize = size / 2;
        quad(nextSize, x, y);
        quad(nextSize, x, y + nextSize);
        quad(nextSize, x + nextSize, y);
        quad(nextSize, x+nextSize, y + nextSize);
    }
    boolean isSameNumbers(int size, int x, int y){
        int no = sArr[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if( no != sArr[i][j] ){
                    return false;
                }
            }
        }
        return true;
    }
}