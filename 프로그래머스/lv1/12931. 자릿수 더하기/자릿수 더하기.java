import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String q = String.valueOf(n);
        for (int i =0 ; i<q.length() ; i++){
            answer+=Character.getNumericValue(q.charAt(i));
        }

        return answer;
    }
}