import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character,Integer> map = new HashMap();
        for(String s : keymap){
            for(int i =0; i<s.length(); i++){
                if(!map.containsKey(s.charAt(i)))
                    map.put(s.charAt(i),i+1);
                else{
                    if(map.get(s.charAt(i))>i+1){
                        map.put(s.charAt(i),i+1);
                    }
                }
            }
        }
        int k =0;
        for(String s: targets){
            int sum =0;
            for(int i = 0; i<s.length(); i++){
                if(map.containsKey(s.charAt(i))){
                    sum+=map.get(s.charAt(i));
                }
                else{
                    sum=-1;
                    break;
                }
            }
            answer[k]=sum;
            k++;
        }
        
        return answer;
    }
}