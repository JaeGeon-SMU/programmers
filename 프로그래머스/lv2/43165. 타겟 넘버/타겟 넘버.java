class Solution {
    int answer=0;
    public int solution(int[] numbers, int target) {
        int sum = 0;
        dfs(numbers,sum,target,0);
        return answer;
    }
    public void dfs(int[] numbers, int sum ,int target,int idx){
        if(idx == (numbers.length-1)){
            if(sum+numbers[idx]==target)
                answer++;
            else if( sum-numbers[idx]==target)
                answer++;
        }
        else{
            dfs(numbers,sum+numbers[idx],target,idx+1);
            dfs(numbers,sum-numbers[idx],target,idx+1);
        }
    }
}