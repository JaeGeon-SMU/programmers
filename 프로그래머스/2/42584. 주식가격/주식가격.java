import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer[]> s = new Stack();

        for(int i = 0; i<prices.length; i++){
            if(s.isEmpty()) s.push(new Integer[]{i,prices[i]});
            else if(s.peek()[1] <= prices[i]) s.push(new Integer[]{i,prices[i]});
            else{
                while(!s.isEmpty() && s.peek()[1]>prices[i]){
                    Integer[] n = s.pop();
                    answer[n[0]]=i-n[0];
                }
                s.push(new Integer[]{i,prices[i]});
            }
        }
        for(int k = 0 ; k<prices.length ; k++){
            if(answer[k] == 0) answer[k]=(prices.length-1)-k;
        }
        return answer;
    }
}