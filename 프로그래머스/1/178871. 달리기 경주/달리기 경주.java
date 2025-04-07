import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String,Integer> m = new HashMap<>();
        for(int i = 0; i<players.length; i++) m.put(players[i],i);
        for(String s : callings ){
            int idx = m.get(s);
            
            s = players[idx-1];
            players[idx-1] = players[idx];
            players[idx]=s;
            
            m.put(players[idx],idx);
            m.put(players[idx-1],idx-1);
        }
        return players;
    }
}