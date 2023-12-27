class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        int answerMusicPlayTime = 0;
        
        for(int i=0; i<musicinfos.length; i++){
            String[] musicInfo = musicinfos[i].split(",");
            String start = musicInfo[0];
            String end = musicInfo[1];
            String musicName = musicInfo[2];
            String music = musicInfo[3];
            
            int musicPlayTime = calculateMusicPlayTime(start, end);
            String fullMusic = createFullMusic(music, musicPlayTime);
            
            boolean isContain = containMusicName(fullMusic, m);
            if (isContain){
            
                if (answerMusicPlayTime < musicPlayTime) {
                    answer = musicName;
                    answerMusicPlayTime = musicPlayTime;
                }
            }
        }
        
        return answer;
    }
    public boolean containMusicName(String fullMusic, String keyword){
        while(true){
            int findIndex = fullMusic.indexOf(keyword);
            if (findIndex < 0){
                return false;
            }
            
            //뒤에 더이상 글자가 없으면
            int searchIndex = findIndex + keyword.length();
            if (searchIndex >= fullMusic.length()){
                return true;
            }
            
            //뒤에 #이 아니면
            char nextChar = fullMusic.charAt(searchIndex);
            if (nextChar != '#'){
                return true;
            }
            
            fullMusic = fullMusic.substring(searchIndex);
        }   
    }
    public String createFullMusic(String music, int time){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int i = 0;
        while(count < time){
            char findChar = music.charAt(i % music.length());
            char nextChar = music.charAt((i+1) % music.length());
            sb.append(findChar);
            i++;
            
            if (nextChar == '#'){
                sb.append(nextChar);
                i++;
            }
            count++;
        }
        
        return sb.toString();
    }
    
    public int calculateMusicPlayTime(String start, String end){
        int result = 0;
        
        final String separator = ":";
        String[] startTime = start.split(separator);
        String[] endTime = end.split(separator);
        
        int startHour = Integer.parseInt(startTime[0]);
        int startMin = Integer.parseInt(startTime[1]);
        int endHour = Integer.parseInt(endTime[0]);
        int endMin = Integer.parseInt(endTime[1]);
        
        result += (endHour - startHour) * 60;
        result += endMin - startMin;
        
        return result;
    }
}