import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        String[] arr = new String[numbers.length];
        for(int i = 0; i<numbers.length; i++){
            arr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(arr,(s2,s1) -> (s1+s2).compareTo(s2+s1));
        if(arr[0].equals("0"))
            return "0";
        for(String s : arr)
            answer.append(s);
        return answer.toString();
    }
}