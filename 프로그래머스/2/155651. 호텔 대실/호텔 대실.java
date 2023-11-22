class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        int[] arr = new int[1450];
        for(String[] s : book_time){
            arr[Integer.valueOf(s[0].split(":")[0])*60+Integer.valueOf(s[0].split(":")[1])]++;
            arr[Integer.valueOf(s[1].split(":")[0])*60+Integer.valueOf(s[1].split(":")[1])+10]--;
        }
        for(int i = 1 ; i<arr.length; i++){
            arr[i] +=arr[i-1];
            answer=Math.max(answer,arr[i]);
        }
        return answer;
    }
}