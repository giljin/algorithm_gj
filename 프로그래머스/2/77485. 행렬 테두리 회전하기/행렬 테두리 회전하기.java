class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        
        // 배열 초기화
        int[][] arr = new int[rows][columns];
        int num = 1;
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                arr[i][j] = num++;
            }
        }
        
        for(int i=0; i<queries.length; i++){
            answer[i] = rotation(arr, queries[i]);
        }
        
        return answer;
    }
    
    public int rotation(int[][] arr, int[] query){
        int row1 = query[0];
        int col1 = query[1];
        int row2 = query[2];
        int col2 = query[3];
            
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int dc = 0;
        
        int cX = col1;
        int cY = row1;
        int temp = arr[cY-1][cX-1];
        int min = temp;
        while(dc < 4){
                
            int mX = cX + dx[dc];
            int mY = cY + dy[dc];
            if(mX > col2 || mY > row2 || mX < col1 || mY < row1 ){
                dc++;
                continue;
            }
            min = Math.min(min, arr[mY-1][mX-1]);
            arr[cY-1][cX-1] = arr[mY-1][mX-1];
            cX = mX;
            cY = mY;     
        }
        arr[row1-1][col1] = temp;
        
        return min;
    }
}