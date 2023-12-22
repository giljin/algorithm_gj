import java.util.*;

class Solution {
    public String solution(String p) {
        return work(p);
    }
    public String work(String p){
        String result = "";
        if(p.isEmpty()){
            return p;
        }
        String[] uv = split(p);
        String u = uv[0];
        String v = uv[1];
        if(isPerpectString(u)){
            return u + work(v);
        }
        String temp = "(" + work(v) + ")";
        String uTemp = u.substring(1, u.length()-1);
        return temp + reverse(uTemp);
    }
    public String reverse(String p){
        String result = "";
        for(int i=0; i<p.length(); i++){
            char findChar = p.charAt(i);
            if (findChar == '('){
                result += ")";
            }else{
                result += "(";
            }
        }
        return result;
    }
    public boolean isPerpectString(String p){
        int openCount = 0;
        int closeCount = 0;
        for(int i=0; i<p.length(); i++){
            char findChar = p.charAt(i);
            if(findChar == ')'){
                closeCount++;
                if(openCount < closeCount){
                    return false;
                }
            }else{
                openCount++;
            }
        }
        return true;
    }
    
    public String[] split(String p){      
        int[] counts = new int[2];
        counts[p.charAt(0)-'(']++;
        for(int i=1; 1<p.length(); i++){
            counts[p.charAt(i)-'(']++;
            if (counts[0] == counts[1]){
                return new String[]{p.substring(0, i+1), p.substring(i+1)};
            }
        }
        return new String[]{p, ""};
    }
    

}