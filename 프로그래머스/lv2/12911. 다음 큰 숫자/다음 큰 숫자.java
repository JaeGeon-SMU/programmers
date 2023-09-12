class Solution {
    public int solution(int n) {
        String s =Integer.toBinaryString(n).replace("0","");
        int q = s.length();
        for( int i = n+1 ; ;i++){
            if(q == Integer.toBinaryString(i).replace("0","").length())
                return Integer.valueOf(i);
        }
    }
}