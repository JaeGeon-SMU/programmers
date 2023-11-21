class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        int[] arr = new int[60*24+10];
        for(String[] s : book_time){
            arr[Integer.parseInt(s[0].split(":")[0])*60 + Integer.parseInt(s[0].split(":")[1])]++;
            arr[Integer.parseInt(s[1].split(":")[0])*60 + Integer.parseInt(s[1].split(":")[1])+10]--;
        }
        for(int i = 1 ; i<arr.length; i++){
            arr[i]+=arr[i-1];
            answer=Math.max(arr[i],answer);
        }
        return answer;
    }
}