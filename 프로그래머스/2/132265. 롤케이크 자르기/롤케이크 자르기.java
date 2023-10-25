import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Set<Integer> s1 = new HashSet();
        Set<Integer> s2 = new HashSet();
        int[] arr1 = new int[topping.length];
        int[] arr2 = new int[topping.length];
        for(int i = 0; i<topping.length; i++){
            s1.add(topping[i]);
            s2.add(topping[topping.length-1-i]);
            arr1[i]=s1.size();
            arr2[topping.length-1-i]=s2.size();
        }
        for(int i =0; i<topping.length-1; i++){
            if(arr1[i]==arr2[i+1])
                answer++;
        }
        return answer;
    }
}