class Solution {
    int solution(int[][] land) {
        int answer = 0;
    
        int[][] sum = new int[land.length+1][land[0].length];
        for(int i = 1; i<sum.length; i++ ){
            for(int j = 0; j<sum[0].length; j++){
                int maxSum = 0;
                for(int k = 0; k<land[0].length ; k++){
                    if(j!=k)
                        maxSum = Math.max(maxSum,sum[i-1][k]); 
                }
                sum[i][j] +=(maxSum+land[i-1][j]); 
            }
        }
        
        for(int a = 0; a<sum[0].length; a++){
            answer = Math.max(answer,sum[land.length][a]);
        }
        
        return answer;
    }
}