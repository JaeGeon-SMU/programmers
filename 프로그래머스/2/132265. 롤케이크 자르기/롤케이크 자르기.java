import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Set<Integer> s1 = new HashSet();       
        Set<Integer> s2 = new HashSet();
        int[] s1Arr = new int[topping.length];
        int[] s2Arr = new int[topping.length];
        for(int i =0; i<topping.length; i++){
            s1.add(topping[i]);
            s1Arr[i] = s1.size();
            s2.add(topping[(topping.length-1)-i]);
            s2Arr[(topping.length-1)-i] = s2.size();
        }
        for(int i=0; i<topping.length-1; i++){
            if(s1Arr[i] == s2Arr[i+1])
                answer++;
        }
        return answer;
    }
}