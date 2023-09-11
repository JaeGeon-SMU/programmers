class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1 ; i<= n; i++){
            if(i%2==0){
                if( ((2*n+i-i*i)/(2*i)>0) && ((2*n+i-i*i)%(2*i) == 0))
                    answer++;
            }
            else{
                if( ((2*n-i*i+i)/(2*i) >0) && ((2*n-i*i+i)%(2*i) == 0))
                    answer++;
            }
        }
        return answer;
    }
}