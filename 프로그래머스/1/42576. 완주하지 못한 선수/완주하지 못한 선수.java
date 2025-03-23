import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        StringBuilder sb = new StringBuilder();
        Map<String,Integer> m = new HashMap<String,Integer>();
        for(String s : completion){
            if(m.get(s)!=null){
                m.put(s,m.get(s)+1);
            }else{
                m.put(s,1);
            }
        }
        for(String s: participant){
            if(m.get(s)==null || m.get(s) ==0){
                sb.append(s);
                break;
            }else{
                m.put(s,m.get(s)-1);
            }
        }
        return sb.toString();
    }
}