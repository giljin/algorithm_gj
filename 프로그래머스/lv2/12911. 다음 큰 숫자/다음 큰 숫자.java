class Solution {
    public int solution(int n) {
        int beforeCount = getOneCount(Integer.toBinaryString(n));

        while (true){
            n++;
            int afterCount = getOneCount(Integer.toBinaryString(n));
            if( beforeCount == afterCount ){
                return n;
            }
        }
    }
    
    public int getOneCount(String binary){
        int result = 0;
        for (int i = 0; i < binary.length(); i++) {
            if( binary.charAt(i) == '1' ){
                result++;
            }
        }
        return result;
    }
}