class Solution {
    public int[] solution(String[] park, String[] routes) {
        int w = park[0].length(); int h = park.length;
        int sw = -1; int sh =-1; int j=0;
        for(int i =0 ; i<h; i++){
            for(j=0; j<w; j++){
                if(park[i].charAt(j)=='S'){
                    sh=i; sw=j;
                    break;
                }
            }
        }
        for(String s : routes){
            char c = s.charAt(0);
            int move = s.charAt(2)-'0';
            boolean flag = true;
            switch(c){
                case 'E':
                    if(sw+move >w-1)
                        flag=false;
                    else{
                        for(int i = sw; i<=sw+move;i++){
                            if(park[sh].charAt(i) =='X'){
                                flag = false;
                                break;
                            }
                        }
                        if(flag)
                            sw+=move;
                    }
                    break;
                case 'W':
                    if(sw-move<0)
                        flag = false;
                    else{
                        for(int i = sw; i>=sw-move; i--){
                            if(park[sh].charAt(i)=='X'){
                                flag = false;
                                break;
                            }
                        }
                        if(flag)
                            sw-=move;
                    }
                    break;
                case 'N':
                    if(sh-move<0)
                        flag = false;
                    else{
                        for(int i = sh; i>=sh-move; i--){
                            if(park[i].charAt(sw)=='X'){
                                flag = false;
                                break;
                            }
                        }
                        if(flag)
                            sh-=move;
                    }
                    break;
                case 'S':
                    if(sh+move>h-1)
                        flag = false;
                    else{
                        for(int i = sh; i<=sh+move; i++){
                            if(park[i].charAt(sw)=='X'){
                                flag=false;
                                break;
                            }
                        }
                        if(flag)
                            sh+=move;
                    }
                    break;
            }
        }
        return new int[]{sh,sw};
    }
}