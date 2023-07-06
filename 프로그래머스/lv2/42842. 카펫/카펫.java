class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0 ,0};

        for (int i = 1; i <= Math.sqrt(yellow); i++) {
            if( yellow % i == 0 ){
                int width = yellow / i;
                int height = i;

                int cBrownWidth = width + 2;
                int cBrownHeight = height + 2;
                int currentBrownSize = ( cBrownWidth + height ) * 2;
                if( currentBrownSize == brown ){
                    answer[0] = cBrownWidth;
                    answer[1] = cBrownHeight;
                    break;
                }
            }
        }

        return answer;
    }
}