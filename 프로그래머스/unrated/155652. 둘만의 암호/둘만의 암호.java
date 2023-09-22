import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        int aa=0;
        char c ;
        for(int i = 0; i<s.length(); i++){
            c = s.charAt(i);
            int idx = index;
            for(int j = 1 ; j<=idx; j++){
                aa = c+j;
                while(aa>122)
                    aa-=26;
                if(skip.indexOf((char)aa)!=-1)
                    idx++;
            }
            sb.append((char)aa);
        }
        return sb.toString();
    }
}