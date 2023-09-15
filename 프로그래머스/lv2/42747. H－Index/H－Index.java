import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int cnt = citations.length;
        
        Arrays.sort(citations);
        for(int i=0; i<cnt; i++){
            int h = cnt-i;
            if(citations[i]>=h){
                answer = h;
                break;
            }
        }
        return answer;
    }
}
