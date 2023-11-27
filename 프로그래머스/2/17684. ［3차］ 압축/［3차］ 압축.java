import java.util.*;
class Solution {
    public int[] solution(String msg) {
        List<Integer> ans = new ArrayList();
        StringBuilder sb = new StringBuilder();
        List<String> l = new ArrayList(); l.add("0");
        for(int i = 65; i<=90; i++){
            char a = (char)i;
            l.add(String.valueOf(a));
        }
        for(int i = 0; i<msg.length(); i++){
            sb.append(msg.charAt(i));
            for(int j = i+1; j<msg.length(); j++){
                if(l.indexOf(sb.toString()+msg.charAt(j)) ==-1){
                    l.add(sb.toString()+msg.charAt(j));
                    break;
                }
                sb.append(msg.charAt(j));
                i++;
            }
            ans.add(l.indexOf(sb.toString()));
            sb.setLength(0);
        }
        int[] answer = new int[ans.size()];
        for(int i = 0; i<ans.size(); i++)
            answer[i]=ans.get(i);
        return answer;
    }
}