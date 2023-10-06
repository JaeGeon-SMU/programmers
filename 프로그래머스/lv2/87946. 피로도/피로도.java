class Solution {
    int answer = 0;
    public int solution(int k, int[][] dungeons) {
        boolean[] visit = new boolean[dungeons.length];
        dfs(dungeons,k,visit,answer);
        return answer;
    }
    public void dfs(int[][] dungeons, int k,boolean[] visit,int count){
        for(int i = 0 ; i<dungeons.length; i++){
            if(visit[i] !=true && k>=dungeons[i][0]){
                visit[i]=true;
                dfs(dungeons,k-dungeons[i][1],visit,count+1);
                visit[i]=false;
            }
        }
        answer=Math.max(count,answer);
    }
}