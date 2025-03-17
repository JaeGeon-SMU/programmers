class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(int i = 0; i<skill_trees.length;i++){
            String s = skill_trees[i];
            answer++;
            for(int j = skill.length()-1; j>0; j--){
                int back = s.indexOf(skill.charAt(j));
                int front = s.indexOf(skill.charAt(j-1));
             
                if(back>=0 &&((front > back )||front<0)){
                    answer--;
                    break;
                }
            }
        }
        return answer;
    }
}