import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Integer[] arr = new Integer[10000001];
        Arrays.fill(arr,0);
        for(int a : tangerine){
            arr[a]++;
        }
        Arrays.sort(arr,Collections.reverseOrder());
        
        for(int q : arr){
            answer++;
            k=k-q;
            if(k<=0)
                break;
        }
        
        return answer;
    }
}