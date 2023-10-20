import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> s = new Stack();
        for(int i = 0; i<prices.length; i++){
            if(s.isEmpty()) s.push(i);
            else if(prices[s.peek()]<=prices[i]) s.push(i);
            else if(prices[s.peek()]>prices[i]){
                while(!s.isEmpty() && prices[s.peek()]>prices[i]){
                    answer[s.peek()] = i-s.peek();
                    s.pop();
                }
                s.push(i);
            }
        }
       
        while(!s.isEmpty()){
            answer[s.peek()] = (prices.length-1)-s.peek();
            s.pop();
        }
        return answer;
    }
}