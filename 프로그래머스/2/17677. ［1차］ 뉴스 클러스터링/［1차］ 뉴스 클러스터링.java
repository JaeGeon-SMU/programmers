import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        int cnt = 0;
        List<String> s = new ArrayList();
        List<String> s2 = new ArrayList();
        for(int i=0; i<str1.length()-1; i++){
            char c1= str1.charAt(i);
            char c2= str1.charAt(i+1);
            if( !(c1>='a'&&c1<='z') && !(c1>='A' && c1<='Z'))
                continue;
            if( !(c2>='a'&&c2<='z') && !(c2>='A' && c2<='Z'))
                continue;
            String str = ""+c1+c2;           
            s.add(str.toLowerCase());
        }
        for(int j=0; j<str2.length()-1; j++){
            char c1= str2.charAt(j);
            char c2= str2.charAt(j+1);
            if( !(c1>='a'&&c1<='z') && !(c1>='A' && c1<='Z'))
                continue;
            if( !(c2>='a'&&c2<='z') && !(c2>='A' && c2<='Z'))
                continue;
            String str = ""+c1+c2;
            s2.add(str.toLowerCase());
        }
        int idx = 0;
        int ssize = s.size();
        int s2size = s2.size();
        if(s2.size()<s.size()){
            for(int i = 0 ; i<s2.size(); i++){
                if(s.indexOf(s2.get(i)) !=-1){
                    cnt++;
                    s.remove(s2.get(i));
                }
            }
        }
        else{
             for(int i = 0 ; i<s.size(); i++){
                if(s2.indexOf(s.get(i)) !=-1){
                    cnt++;
                    s2.remove(s.get(i));
                }
            }
        }
        if(ssize == 0 && s2size ==0)
            return 65536;
        else
            answer = cnt*65536/(ssize+s2size-cnt);
        return answer;
    }
}