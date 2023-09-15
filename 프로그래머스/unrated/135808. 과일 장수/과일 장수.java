import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int a = score.length;
        Arrays.sort(score);
        
        for(int j = 1 ; j<=a/m ; j++){
        answer = answer + score[a-m*j]*m;
        }
         
        return answer;
    }
}