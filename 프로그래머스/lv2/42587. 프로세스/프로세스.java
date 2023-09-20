import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue((s1,s2) -> (int)s2-(int)s1);
        for(int a: priorities)
            q.add(a);
        
        while(!q.isEmpty()){
            for(int i = 0; i<priorities.length; i++){
                if(q.peek() == priorities[i]){
                    if(i==location){
                        return ++answer;
                    }
                    q.poll();
                    answer++;
                }
            }
        }
        return answer;
    }
}