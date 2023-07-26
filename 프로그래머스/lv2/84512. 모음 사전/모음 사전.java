class Solution {
    String[] alphabets = {"A", "E", "I", "O", "U"};
    String target;
    int count = 0;
    boolean isComplete = false;
    
    public int solution(String word) {
        target = word;
        DFS("");
        
        return count;
    }
    
    public void DFS(String word){

        if( word.equals(target) ){
            isComplete = true;
            return;
        }

        count++;
        if( word.length() == 5 ){
            return;
        }

        for (int i = 0; i < alphabets.length; i++) {
            String w = word+alphabets[i];
            if( !isComplete ) {
                DFS(w);
            }
        }
    }
}