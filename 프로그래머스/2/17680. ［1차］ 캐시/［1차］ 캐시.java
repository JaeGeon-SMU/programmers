import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> l = new ArrayList();
        for(String s : cities){
            int idx = -1;
            for(int j = 0; j<l.size(); j++){
                if(s.equalsIgnoreCase(l.get(j))){
                    idx = j;
                    break;
                }
            }  
            
            if(l.size() !=cacheSize){
                if(idx != -1)
                    answer+=1;
                else
                    answer+=5;
                l.add(s);
            }
            else if(cacheSize!=0){
                if(idx != -1){
                    l.remove(idx);
                    answer+=1;
                    l.add(s);
                }
                else{
                    answer+=5;
                    l.remove(0);
                    l.add(s);
                }
            }
            else{
                answer+=5;
            }
        }
        return answer;
    }
}