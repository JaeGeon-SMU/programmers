class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int start = section[0];
        for(int a : section){
            if(start+m-1<a){
                start=a;
                answer++;
            }
        }
        return answer;
    }
}