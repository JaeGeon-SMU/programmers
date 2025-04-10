class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int pre = 1;
        for(int i =1; i<section.length; i++){
            if(pre+m-1<section[i]){
                answer++;
                pre=section[i];
            }
        }
        return answer;
    }
}