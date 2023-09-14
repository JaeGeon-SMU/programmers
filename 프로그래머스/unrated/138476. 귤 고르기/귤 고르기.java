import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap();
        for(int a : tangerine){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        List<Integer> l = new ArrayList(map.values());
        Collections.sort(l,Collections.reverseOrder());
        
        for(Integer q : l){
            k=k-q;
            answer++;
            if(k<=0)
                break;
        }
        return answer;
    }
}