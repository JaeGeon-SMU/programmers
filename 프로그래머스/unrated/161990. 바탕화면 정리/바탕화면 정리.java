class Solution {
    public int[] solution(String[] wallpaper) {
        int lux=50;int luy=50;int rdx=0;int rdy =0;
        for(int i=0; i<wallpaper.length; i++){
            for(int j=0; j<wallpaper[i].length(); j++){
                if(wallpaper[i].charAt(j)=='#'){
                    if(luy>j) luy=j;
                    if(lux>i) lux=i;
                    if(rdy<j) rdy=j;
                    if(rdx<i) rdx=i;
                }
            }
        }
        int[] answer = {lux,luy,rdx+1,rdy+1};
        return answer;
    }
}