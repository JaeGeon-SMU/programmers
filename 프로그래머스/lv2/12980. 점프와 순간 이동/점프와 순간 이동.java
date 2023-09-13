import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;

        char[] arr = Integer.toBinaryString(n).toCharArray();
        for(char c : arr){
            if(c=='1')
                ans++;
        }

        return ans;
    }
}