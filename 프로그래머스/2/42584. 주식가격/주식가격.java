import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> s = new Stack();
        for(int i = 0; i<prices.length; i++){
            while(!s.isEmpty() && prices[s.peek()]>prices[i]){
                answer[s.peek()] = i - s.pop();
            }
            s.push(i);
        }
        while(!s.isEmpty())
            answer[s.peek()] = prices.length-1 - s.pop();
        return answer;
    }
}