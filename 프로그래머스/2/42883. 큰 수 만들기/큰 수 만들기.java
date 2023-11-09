import java.util.*;
class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int start = 0;
        for(int i = 0; i<number.length()-k; i++){
            int max = 0;
            for(int j = start; j<=k+i;j++){
               char a = number.charAt(j);
                int c = a-'0';
                if(max<c){
                    max =c ;
                    start= j+1;
                }
                
            }
            answer.append(max);
        }
        return answer.toString();
    }
}