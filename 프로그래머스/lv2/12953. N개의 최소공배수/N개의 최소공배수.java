import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        for(int i = 1 ; i<arr.length; i++){
            answer = lcm(answer,arr[i]);
        }
        return answer;
    }
    public int gcd(int a, int b){
        while(a>0) {
            int r=b%a;
            b=a;
            a=r;
        }
        return b;
    }
    public int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
}