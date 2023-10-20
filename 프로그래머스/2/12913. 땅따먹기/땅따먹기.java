class Solution {
    int solution(int[][] land) {
        int answer = 0;
       
        for(int i = 1; i<land.length; i++){
            for(int j = 0; j<land[0].length; j++){
                int addNum = 0;
                for(int k = 0; k<land[0].length; k++){
                    if(k!=j)
                        addNum=Math.max(addNum,land[i-1][k]); 
                }
                land[i][j]+=addNum;
            }
        }
        for(int i = 0; i<land[0].length; i++)
            answer = Math.max(answer, land[land.length-1][i]);
        return answer;
    }
}