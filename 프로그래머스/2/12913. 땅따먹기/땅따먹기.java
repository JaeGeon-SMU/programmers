class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int[][] sum = new int[land.length+1][land[0].length];
        
        for(int i = 1 ; i<sum.length; i++){
            for(int j = 0; j<sum[i].length;j++){
                int addNum = 0;
                for(int k = 0; k<land[0].length; k++){
                    if(k!=j){
                        addNum = Math.max(addNum,sum[i-1][k]);
                    }
                    sum[i][j] = addNum + land[i-1][j];
                }
            }
        } 
        for(int u = 0; u<land[0].length; u++)
            answer = Math.max(answer,sum[land.length][u]);
        return answer;
    }
}