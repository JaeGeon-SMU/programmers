import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i<score.length ; i++){
            if(l.size() == k){
                if(Collections.min(l) < score[i]){
                    l.remove(Collections.min(l));
                    l.add(score[i]);
                }
            }
            else{
                l.add(score[i]);
            }
            answer[i]=Collections.min(l);
        }
        return answer;
    }
}