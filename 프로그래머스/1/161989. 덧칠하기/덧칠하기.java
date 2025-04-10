import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        Set<Integer> s = new HashSet<>();
        for(int i : section) s.add(i);
        int pre = 1;
        for(int i = 0; i<=n; i++){
            for(int j = pre; j<pre+m; j++){
                if(s.contains(i)){
                    answer++;
                    i=i+m-1;
                    break;
                }
            }
        }
        return answer;
    }
}