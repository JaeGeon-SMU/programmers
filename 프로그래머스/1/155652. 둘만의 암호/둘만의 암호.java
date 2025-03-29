class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb =new StringBuilder();
        String all = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        String newAll = all.replaceAll("["+skip+"]","");

        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            int idx = newAll.indexOf(c)+index;
            if(idx >=newAll.length()){
                idx -= newAll.length();
            }
            sb.append(newAll.charAt(idx));
        }
        return sb.toString();
    }
}