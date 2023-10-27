class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int size = triangle.length;
        for(int i = 1; i<size; i++){
            triangle[i][0]+=triangle[i-1][0];
            for(int j = 1; j<triangle[i].length-1;j++){
                triangle[i][j]+=Math.max(triangle[i-1][j-1],triangle[i-1][j]);   
            }
            triangle[i][triangle[i].length-1]+=triangle[i-1][triangle[i-1].length-1];
        }
        for(int i = 0; i<triangle[size-1].length;i++)
            answer = Math.max(answer,triangle[size-1][i]);
        return answer;
    }
}