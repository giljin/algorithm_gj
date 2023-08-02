class Solution {
    public int[] solution(int n) {
        if( n == 1 ){
            return new int[]{1};
        }
        int[][] arr = new int[n][n];
        int x = 0;
        int y = 0;
        int dx = 0;
        int dy = 1;
        arr[y][x] = 1;

        int goal = (n+1) * (n/2) + (n%2==1 ? (n+1)/2 : 0);        
        int[] answer = new int[goal];
        
        while (true){
            int mx = x + dx;
            int my = y + dy;
            if( mx >= 0 && mx < n && my >= 0 && my < n && arr[my][mx] == 0){
                arr[my][mx] = arr[y][x] + 1;
                x = mx;
                y = my;
                if( arr[my][mx] == goal ){
                    break;
                }
                continue;
            }

            if( dx == 0 && dy == 1 ){
                dx = 1;
                dy = 0;
            }else if( dx == 1 && dy == 0 ){
                dx = -1;
                dy = -1;
            }else{
                dx = 0;
                dy = 1;
            }
        }

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                answer[index++] = arr[i][j];
            }
        }
        return answer;
    }
}