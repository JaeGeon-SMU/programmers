import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<Integer>();
        Queue<Integer> p_q = new LinkedList<Integer>();
        Queue<Integer> s_q = new LinkedList<Integer>();

        for(int i = 0 ; i<progresses.length; i++){
            p_q.add(progresses[i]);
            s_q.add(speeds[i]);
        }
        int day =1;
        int cnt =0;
        while(!p_q.isEmpty()){
            int p = p_q.peek();
            int s = s_q.peek();
            if((p+day*s)<100){
                day++;
                if(cnt!=0){
                    list.add(cnt);
                    cnt=0;
                }
            }else{
                p_q.poll();
                s_q.poll();
                cnt++;
            }
        }
        list.add(cnt);
        int[] arr = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}