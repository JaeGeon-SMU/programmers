import java.util.*;
class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int x=0; int y=0;
        Set<String> set = new HashSet();
        for(int i = 0 ; i<dirs.length(); i++){
            if(dirs.charAt(i) == 'U'){
                if(y<5){
                    set.add(x+"_"+y+"/"+x+"_"+(y+1));
                    set.add(x+"_"+(y+1)+"/"+x+"_"+y);
                    y++;
                }
            }
            else if(dirs.charAt(i) =='L'){
                if(x>-5){
                    set.add(x+"_"+y+"/"+(x-1)+"_"+y);
                    set.add((x-1)+"_"+y+"/"+x+"_"+y);
                    x--;
                }
            }
            else if(dirs.charAt(i) =='R'){
                if(x<5){
                    set.add(x+"_"+y+"/"+(x+1)+"_"+y);
                    set.add((x+1)+"_"+y+"/"+x+"_"+y);
                    x++;
                }
            }
            else{
                if(y>-5){
                    set.add(x+"_"+y+"/"+x+"_"+(y-1));
                    set.add(x+"_"+(y-1)+"/"+x+"_"+y);
                    y--;
                }
            }
        }

        return set.size()/2;
    }
}