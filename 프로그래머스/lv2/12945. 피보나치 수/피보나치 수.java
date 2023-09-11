class Solution {
    public int solution(int n) {
        int[] arr = new int[n+1];
        
        arr[0]=0;
        arr[1]=1;
        int i=2;
        for(; i<arr.length;i++){
            arr[i]= arr[i-1]+arr[i-2];
            arr[i]%=1234567;
        }
        return arr[i-1]%1234567;
    }
}