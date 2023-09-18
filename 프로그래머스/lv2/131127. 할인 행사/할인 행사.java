import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer =0;
        
        for(int i = 0 ; i<discount.length-9 ;i++){
            boolean flag = false;
            Map<String,Integer> map = new HashMap();
            for(int j = i ; j<i+10; j++)
                 map.put(discount[j],map.getOrDefault(discount[j],0)+1);
            for(int k = 0 ; k<want.length; k++){
                if(map.getOrDefault(want[k],-1) != number[k]){
                    flag= false;
                    break;
                }
                else
                    flag=true;
            }
            if(flag)answer++;
        }    
        return answer;
    }
}