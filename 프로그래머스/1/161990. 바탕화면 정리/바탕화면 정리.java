class Solution {
    public int[] solution(String[] wallpaper) {
        //lux, luy, rdx, rdy (lux < rdx, luy < rdy)
        int[] answer = {-1, -1, -1, -1};

        for(int i=0; i< wallpaper.length; i++){
            int firstIndex = wallpaper[i].indexOf("#");

            if( firstIndex >= 0 ){
                //lux 구하기
                if( answer[0] < 0 ){
                    answer[0] = i;
                    answer[1] = firstIndex;
                }
                //luy 구하기
                if( answer[1] > firstIndex ){
                    answer[1] = firstIndex;
                }
            }

            int lastIndex = wallpaper[i].lastIndexOf("#");
            if( lastIndex >= 0 ){
                //rux 구하기
                answer[2] = Math.max(answer[2], i+1);
                //ruy 구하기
                answer[3] = Math.max(answer[3], lastIndex+1);
            }
        }

        return answer;
    }
}