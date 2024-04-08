class Solution {
    public int[] solution(int[] num_list) {
        int idx = num_list.length-1;
        int[] answer = new int[idx+2];
        for(int i=0; i<idx+1; i++)
            answer[i]=num_list[i];
        if(num_list[idx-1]<num_list[idx])
            answer[idx+1]=num_list[idx]-num_list[idx-1];
        else
            answer[idx+1]=num_list[idx]*2;
        return answer;
    }
}