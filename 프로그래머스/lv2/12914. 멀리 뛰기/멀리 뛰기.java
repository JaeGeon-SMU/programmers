class Solution {
    public long solution(int n) {

        if(n==1)return 1;
        if(n==2)return 2;
        int[] arr = new int[2001];
        int i =0;
        arr[1]=1;
        arr[2]=2;
        for(i = 3 ; i<=n; i++){
            arr[i] = arr[i-1]%1234567 + arr[i-2]%1234567;
        }
        return arr[i-1]%1234567;
    }
}