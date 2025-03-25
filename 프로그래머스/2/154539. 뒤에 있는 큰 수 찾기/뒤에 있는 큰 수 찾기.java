import java.util.Stack;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> s = new Stack<>();
        s.push(numbers[numbers.length-1]);
        answer[numbers.length-1]=-1;
        for(int i =numbers.length-2; i>=0 ; i--){
            int num = numbers[i];
            while(!s.isEmpty() && s.peek()<=num){
                s.pop();
            }
            if(s.isEmpty()){
                answer[i]=-1;
            }else{
                answer[i]=s.peek();
            }
            s.push(num);
        }
        return answer;
    }
}