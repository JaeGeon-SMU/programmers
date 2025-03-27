class Solution {
    public int solution(String s) {
        int answer = 0;
        int x=0;
        int non_x=0;
        char c=s.charAt(0);
        for (int i = 0; i<s.length(); i++){
            if(x==0 && non_x ==0){
                x=1;
                c=s.charAt(i);
            }else{
                if(c==s.charAt(i)){
                    x++;
                }else{
                    non_x++;
                }
                if(x==non_x){
                    answer++;
                    x=0;
                    non_x=0;
                }
            }
            
        }
        if(x!=0 || non_x!=0){
            answer++;
        }
        return answer;
    }
}