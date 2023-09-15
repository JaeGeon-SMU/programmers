import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int cnt = citations.length;
        
        Arrays.sort(citations);
        for(int k=0; k<=cnt; k++){
            int a=0;
        for(int i=0; i<cnt; i++){
            if(citations[i]>=answer)
                a++;
        }
        if(a>=answer && cnt-a<=answer)
            answer++;
        else
            break;
    }
        
        return --answer;
    }
}
