import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i = 0; i<s.length() ; i++)
        {
            int min = -1;
                for( int j = 0; j<i ; j++)
                 if(s.charAt(i)==(s.charAt(j)))
                    {       
                        if(min == -1)
                            min = i-j;
                        else
                            min = min > (i-j) ? (i-j) : min ;
                    }
            answer[i]=min;
        }
         
        return answer;
    }
}