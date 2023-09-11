import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        int idx = B.length-1;
        for(int a : A){
            answer+=a*B[idx--];
        }
        
        return answer;
    }
}