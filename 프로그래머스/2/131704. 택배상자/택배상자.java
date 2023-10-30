import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int cnt =1;
        Stack<Integer> s = new Stack();
        for(int i = 0; i<order.length; i++){
            while(order[i] >cnt)
                s.push(cnt++);
            if(order[i]==cnt) {answer++;cnt++;}
            else{
                if(s.pop()==order[i])
                    answer++;
                else
                    break;
            }           
        }
        return answer;
    }
}