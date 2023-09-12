import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        List<Integer> l = new ArrayList();
        for(int i = 1; i<=yellow ; i++){
            if(yellow % i ==0){
                l.add(i);
            }
        }
        for(int a : l){
            int n1 = a+2;
            int n2 = (yellow/a)+2;
            if(n1*n2 == brown+yellow){
                answer[0] = n1;
                answer[1] = n2;
            }
        }
        return answer;
    }
}