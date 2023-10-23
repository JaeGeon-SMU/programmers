import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> s = new Stack();
        for(int i = 0; i<prices.length; i++){
            if(s.isEmpty()) s.push(i);
            else if(prices[s.peek()]<=prices[i]) s.push(i);
            else{
                while(!s.isEmpty() && prices[s.peek()]>prices[i]){
                    int a = s.pop();
                    answer[a]=i-a;
                }
                s.push(i);
            }
        }
        while(!s.isEmpty()){
            int a = s.pop();
            answer[a]=(prices.length-1)-a;
        }
        return answer;
    }
}