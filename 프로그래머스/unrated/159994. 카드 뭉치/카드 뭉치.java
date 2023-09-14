class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i = 0;
        int i2 = 0;

        for(String g : goal){
            if(g.equals(cards1[i]))
                i++;
            else if(g.equals(cards2[i2]))
                i2++;
            else
                return "No";
            if(i == cards1.length)
                i--;
            if( i2 == cards2.length)
                i2--;
        }
        return "Yes";
    }
}