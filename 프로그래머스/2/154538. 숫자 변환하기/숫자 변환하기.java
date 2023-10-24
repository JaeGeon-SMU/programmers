import java.util.*;
class Solution {
    int answer= 0;
    Queue<Integer[]> q = new LinkedList();
    public int solution(int x, int y, int n) {
        q.add(new Integer[]{y,0});
        if(y==x)
            return 0;
        bfs(x,n);
        return answer;
    }
    void bfs(int x,int n){
        while(!q.isEmpty()){
            Integer[] a = q.poll();
            if(a[0]==x){
                answer = a[1];  
                break;
            }
            if(a[0]%3==0)
                q.add(new Integer[]{a[0]/3,a[1]+1});
            if(a[0]%2==0)
                q.add(new Integer[]{a[0]/2,a[1]+1});
            if(a[0]-n>=x)
                q.add(new Integer[]{a[0]-n,a[1]+1});
        }
        answer = answer ==0 ? -1:answer;
    }
    
    
}