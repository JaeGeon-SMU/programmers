import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1 ; i< food.length; i++){
            for(int j = 1 ; j<=food[i]/2; j++){
                answer+=i;
            }
        }
        StringBuilder sb = new StringBuilder(answer);
        String reverseSb = sb.reverse().toString();
        return answer+0+reverseSb;
    }
}