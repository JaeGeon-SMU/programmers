import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = false;

        Stack q = new Stack();
        for(char a : s.toCharArray()){
            try{
            if(a=='(')
                q.push(a);
            else if ( a==')')
                q.pop();
            }catch (Exception e){
                return false;
            }
        }
        if(q.empty())
            answer = true;
        
        
        return answer;
    }
}