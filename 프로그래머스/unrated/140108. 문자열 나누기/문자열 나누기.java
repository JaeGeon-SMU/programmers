class Solution {
    public int solution(String s) {
        int answer = 0;
        int sc =0; int nsc =0;
        char c=s.charAt(0);
        for(int i = 0; i<s.length(); i++){
            if(sc==nsc){
               c = s.charAt(i);
            }
            if(c==s.charAt(i))
                sc++;
            else
                nsc++;
            if(sc==nsc){
                answer++;
                sc=0;
                nsc=0;
            }
        }
        if(sc+nsc>0)
            answer++;
        return answer;
    }
}