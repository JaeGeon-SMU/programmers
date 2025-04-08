import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String,Integer> m = new HashMap<>();
        for(int i = 0; i<name.length; i++){
            m.put(name[i],yearning[i]);
        }
        for(int i=0; i<answer.length; i++){
            answer[i]=0;
            for(String s : photo[i]){
                answer[i]+=m.getOrDefault(s,0);
            }
        }
        return answer;
    }
}