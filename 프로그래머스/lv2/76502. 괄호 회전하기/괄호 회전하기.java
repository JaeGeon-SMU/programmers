import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i = 0 ; i<s.length(); i++){
            Stack<Character> ss = new Stack<>();
            for(int j = i; j<i+s.length(); j++){
                char c = s.charAt(j%s.length());     
                    if(ss.isEmpty())
                        ss.push(c);
                    else if(c==')' && ss.peek() == '(')
                        ss.pop();
                    else if(c==']' && ss.peek() == '[')
                        ss.pop();
                    else if(c=='}' && ss.peek() == '{')
                        ss.pop();
                    else
                        ss.push(c);
            }
            if(ss.isEmpty())
                answer++;
        }
        return answer;
    }
}