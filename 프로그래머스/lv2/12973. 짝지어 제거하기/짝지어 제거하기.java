import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack q = new Stack();
        char[] arr =s.toCharArray();
        for(char c : arr){
            if(q.isEmpty() || (char)q.peek() != c){
                q.push(c);
            }
            else
                q.pop();
        }
        if(q.isEmpty())
            answer =1;
        

        return answer;
    }
}