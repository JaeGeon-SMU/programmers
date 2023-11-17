import java.util.*;
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        Stack<Integer> st = new Stack();
        while(n>=3){
            int num = n%k;
            sb.append(num);
            n/=k;
        }
        sb.append(n);
        String s = sb.reverse().toString();
        for(int i = 0; i<s.length(); i++){
            st.push((s.charAt(i)-'0'));
        }
        sb.setLength(0);
        while(!st.isEmpty()){
            flag = true;
            int num = st.pop();
            if(num != 0)
                sb.append(num);
            else{
                if(sb.length() ==0)
                    continue;
                Long primechk = Long.valueOf(sb.reverse().toString());
                if(primechk <2)
                    flag=false;
                for(int i=2; i<=Math.sqrt(primechk); i++){
                    if(primechk%i == 0){
                        flag = false;
                        break;
                    }
                }
                if(flag)
                    answer++;            
                sb.setLength(0);
            }
        }
        if(sb.length() != 0){
        flag = true;
        Long primechk = Long.valueOf(sb.reverse().toString());
                if(primechk <2)
                    flag=false;
                for(int i=2; i<=Math.sqrt(primechk); i++){
                    if(primechk%i == 0){
                        flag = false;
                        break;
                    }
                }
                if(flag)
                    answer++;
        }
        
        
        return answer;
    }
}