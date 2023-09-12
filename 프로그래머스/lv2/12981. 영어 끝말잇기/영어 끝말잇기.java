import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        
        List l = new ArrayList();
        l.add(words[0]);
        for(int i = 1; i< words.length; i++){
            char[] arr = words[i-1].toCharArray();
            char[] arr2 = words[i].toCharArray();
                if(l.indexOf(words[i]) == -1 && (arr[words[i-1].length()-1] == arr2[0])){
                l.add(words[i]);
            }
            else{
                answer[0]=(i%n)+1;
                answer[1] =(i/n)+1;
                return answer;
            }
        }

        return answer;
    }
}