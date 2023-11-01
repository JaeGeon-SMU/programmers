
import java.util.*;
class Solution {
    public int[] solution(String s) {
        s=s.substring(1,s.length()-1);
        Map<Integer,List<Integer>> map = new HashMap();
        for(int i = 0 ; i<s.length();i++){
            if(s.charAt(i)=='{'){
                i++;
                List<Integer> l = new ArrayList();
                String sss = "";
                while(s.charAt(i)!='}'){
                    char c = s.charAt(i);
                    if(c != ',')
                        sss+=c;
                    else if(c ==','){
                        l.add(Integer.valueOf(sss));
                        sss="";
                    }
                    i++;
                }
                l.add(Integer.valueOf(sss));
                map.put(l.size(),l);
            }
        }
        List<Integer> ll = new ArrayList();
        for(int i = 1 ; i<=map.size(); i++){
            List<Integer> l = map.get(i);
            for(int a : l){
                if(ll.indexOf(a)==-1){
                    ll.add(a);
                }
            }
        }
        int[] answer = new int[ll.size()];
        for(int i = 0 ; i<ll.size();i++)
            answer[i]=ll.get(i);
        return answer;
    }
}