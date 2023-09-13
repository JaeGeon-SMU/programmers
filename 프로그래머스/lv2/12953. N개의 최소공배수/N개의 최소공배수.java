import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int i=0;
        int[] arr2 = new int[arr.length];
        arr2[0] = arr[0];
        for(i = 1 ; i<arr.length; i++){
            arr2[i] = lcm(arr2[i-1],arr[i]);
        }
        return arr2[i-1];
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