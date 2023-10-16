class Solution {
    int ans = 0;
    int cnt = 0;
    public int solution(String word) {
        findIndex("",'A',word);
        findIndex("",'E',word);
        findIndex("",'I',word);
        findIndex("",'O',word);
        findIndex("",'U',word);
        return ans;
    }
    public void findIndex(String curString, char c,String word){
        String s = curString+c;
        cnt++;
        if(word.equals(s))
            ans = cnt;
        else if(s.length()<5){
            findIndex(s,'A',word);
            findIndex(s,'E',word);
            findIndex(s,'I',word);
            findIndex(s,'O',word);
            findIndex(s,'U',word);
        }
    }
}