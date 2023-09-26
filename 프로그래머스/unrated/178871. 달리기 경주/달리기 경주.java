import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String,Integer> map = new HashMap();
        for(int i=0; i<players.length; i++)
            map.put(players[i],i);
        for(String s: callings){
            int idx = map.get(s);
            players[idx]=players[idx-1];
            players[idx-1]=s;
            
            map.put(players[idx],map.get(s));
            map.put(s,map.get(s)-1);
        }
        return players;
    }
}