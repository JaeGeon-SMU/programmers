import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int ans = 0;
        StringBuilder sb =new StringBuilder();
        for(int a : ingredient)
            sb.append(a);
        while(sb.indexOf("1231") != -1){
            ans++;
            int idx = sb.indexOf("1231");
            sb=sb.replace(idx,idx+4,"");
        }
        return ans;
    }
}