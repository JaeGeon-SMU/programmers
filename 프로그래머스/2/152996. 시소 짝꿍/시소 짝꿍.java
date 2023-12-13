import java.util.*;
class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        long addNum = 0;
        long pre = 0;
        Arrays.sort(weights);
        for(int i = 0; i<weights.length-1; i++){
            addNum = 0;
            if(i!=0 && weights[i] == weights[i-1]){
                pre--;
                answer += pre;
                continue;
            }
            for(int j = i+1; j<weights.length; j++){
                boolean flag = false ;
                for(int k = 2; k<=4; k++){
                    for(int u =2; u<=4; u++){
                        if(weights[i]*k==weights[j]*u){
                            addNum++;
                            flag = true;
                        }
                        if(flag)
                            break;
                    }
                    if(flag)
                        break;
                }
            }
            pre = addNum;
            answer+= addNum;
        }
        return answer;
    }
}