import java.util.*;
class Solution {
    int ans = 0;
    String s;
    boolean[] visit;
    Set<Integer> set = new HashSet();
    public int solution(String numbers) {
        s=numbers;
        visit = new boolean[numbers.length()];
        for(int a = 0; a<numbers.length(); a++){
            if(numbers.charAt(a) != '0'){
                visit[a] = true;
                dfs(""+numbers.charAt(a));
                visit[a] = false;
            }
        }
        return ans;
    }
    boolean sosu(int n){
        if(n ==1)
            return false;
        for(int i = 2; i<n; i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
    void dfs(String ss){
        if(sosu(Integer.valueOf(ss))){
            int cnt = set.size();
            set.add(Integer.valueOf(ss));
            if(set.size()>cnt)
                ans++;
        }
        for(int i =0; i<s.length(); i++){
            if(!visit[i]){
                visit[i]=true;
                dfs(ss+s.charAt(i));
                visit[i]=false;
            }
        }
    }
}