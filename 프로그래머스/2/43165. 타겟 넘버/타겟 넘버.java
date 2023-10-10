class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers,target,0,0);
        return answer;
    }
    public void dfs(int[] numbers, int target,int sum, int idx){
        if(numbers.length-1 == idx){
            if(sum+numbers[idx] == target)
                answer++;
            else if(sum-numbers[idx] == target)
                answer++;
        }
        else{
            dfs(numbers,target,sum-numbers[idx],idx+1);
            dfs(numbers,target,sum+numbers[idx],idx+1);
        }
    }
}