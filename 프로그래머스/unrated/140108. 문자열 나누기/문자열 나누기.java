class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] arr = s.toCharArray();
        char c = arr[0];
        int sc =0;
        int nsc =0;
        for(int i =0; i<arr.length; i++){
            if(sc+nsc ==0)
                c=arr[i];
            if(c==arr[i])
                sc++;
            else
                nsc++;
            if(sc == nsc ){
                answer++;
                sc=0;
                nsc=0;
            } 
        }
        if( sc+nsc !=0)
            answer++;
        return answer;
    }
}