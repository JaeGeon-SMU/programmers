import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> s = new HashSet();
        for(int i = 0; i<numbers.length-1; i++){
            for(int j = 0; j<numbers.length; j++){
                if(i!=j)
                    s.add(numbers[i]+numbers[j]);
            }
        }
        Iterator<Integer> iter = s.iterator();
        int[] answer = new int[s.size()];
        int i = 0;
        for(Integer a : s){
            answer[i] = a;
            i++;
        }
        Arrays.sort(answer);
        return answer;
    }
}