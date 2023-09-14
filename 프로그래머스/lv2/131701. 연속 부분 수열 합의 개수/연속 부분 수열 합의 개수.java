import java.util.*;
class Solution {
    public int solution(int[] elements) {
        Set<Integer> s = new HashSet();
        
        for(int size =1 ; size <= elements.length; size++){
            for(int i = 0 ; i < elements.length; i++){
                int sum = 0;
                for(int j = i ; j<i+size; j++){
                    sum+=elements[j%elements.length];
                }
                s.add(sum);
            }
        }
        return s.size();
    }
}