import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character,Integer> m = new HashMap<>();
        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            if(m.get(c) == null){
                m.put(c,i);
                answer[i]=-1;
            }else{
                answer[i]=i-m.get(c);
                m.put(c,i);
            }
        }
        return answer;
    }
}