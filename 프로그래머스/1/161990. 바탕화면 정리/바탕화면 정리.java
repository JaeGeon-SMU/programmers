class Solution {
    public int[] solution(String[] wallpaper) {
        int max_x=0; int max_y=0;
        int min_x=51; int min_y=51;
        for(int i =0 ;i<wallpaper.length; i++){
            String s = wallpaper[i];
            if(s.indexOf('#')==-1)
                continue;
            else if(s.indexOf('#')!=-1){
                //y검사
                if(i<=min_y) min_y=i;
                if(i>=max_y) max_y=i+1;
                //x검사
                if(s.indexOf('#')<=min_x) min_x=s.indexOf('#');
                if(s.lastIndexOf('#')>=max_x) max_x=s.lastIndexOf('#')+1;
            }
            
        }
        return new int[]{min_y,min_x,max_y,max_x};
    }
}