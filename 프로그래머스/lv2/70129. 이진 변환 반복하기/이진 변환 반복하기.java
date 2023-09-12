class Solution {
    public int[] solution(String s) {
        
        int i = 0;
        int cnt = 0;
        while(true){
            if(s.equals("1"))
                break;
            String s1 = s.replace("0","");
            cnt += s.length()-s1.length();
            s=Integer.toBinaryString(s1.length());
            i++;
        }
        int[] answer = {i,cnt};
        return answer;
    }
}