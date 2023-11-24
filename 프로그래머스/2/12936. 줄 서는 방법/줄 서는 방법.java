import java.util.*;
class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        List<Integer> l = new ArrayList();
        for(int i = 1; i<=n ; i++)
            l.add(i);
        for(int i = 0; i<n; i++){
            long cnt = soon(n-1-i);
            int a = 0;
            while(k>cnt && cnt!=0){
                k-=cnt;
                a++;
            }
            answer[i] = l.get(a);
            l.remove(a);
        }
        
        return answer;
    }
    
    long soon(long c){
        if(c==2 || c==1||c==0)
            return c;
        return c*soon(c-1);
    }
}