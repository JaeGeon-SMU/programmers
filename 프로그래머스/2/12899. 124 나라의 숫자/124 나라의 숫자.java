import java.util.*;
class Solution {
    public String solution(int n) {
        StringBuilder ans = new StringBuilder();
    
            while(n>0){
            int num = n%3;
            if(num == 0){
                ans.append("4");
                n=n/3-1;
            }
            else{
                ans.append(num);
                n=n/3;
            }
        }
        
        return ans.reverse().toString();
    }
    
    
}