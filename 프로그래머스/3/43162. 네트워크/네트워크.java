import java.util.*;
class Solution {
    int ans = 0;
    int[][] coms;
    Set<Integer> s = new HashSet();
    public int solution(int n, int[][] computers) {
        coms=computers;
        for(int i =0 ; i<n; i++){
            if(!s.contains(i)){
                dfs(i);
                ans++;
            }
        }
        return ans;
    }
    void dfs(int idx){
        int len = s.size();
        s.add(idx);
        for(int i = 0; i<coms.length; i++){
            if(coms[i][idx]==1){
                s.add(i);
                if(s.size()!=len)
                    dfs(i);
            }
        }
    }
}