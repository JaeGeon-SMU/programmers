import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int degree = 7;
        
        for(int a: lottos){
            if(a == 0) zero++;
            for(int q : win_nums){
                if(q==a){
                    degree--;
                    break;
                }
            }
        }
        int max = degree-zero ==7 ? 6: degree-zero;
        if(degree==7)
            degree--;
        int[] answer = {  max     ,degree};
        return answer;
    }
}