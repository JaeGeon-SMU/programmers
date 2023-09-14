import java.util.*;
class Solution {
    public int solution(int[] elements) {
        Set<Integer> s = new HashSet();
        
        for(int size = 1 ; size<=elements.length; size++){
            for(int j = 0 ; j < elements.length; j++){
                int sum = 0;
                for(int i = j ; i<j+size; i++){
                    sum+=elements[i%elements.length];
                }
                s.add(sum);
            }
        }
        return s.size();
    }
}