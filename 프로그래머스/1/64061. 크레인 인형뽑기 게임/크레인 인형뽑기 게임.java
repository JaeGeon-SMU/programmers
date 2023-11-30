import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> s = new Stack();
        for(int move : moves){
            for(int i = 0; i<board.length; i++){
                int a = board[i][move-1];
                if(a!=0){
                    if(!s.isEmpty() && s.peek() == a){
                        s.pop();
                        answer+=2;
                    }
                    else
                        s.push(a);
                    board[i][move-1] =0;
                    break;
                }
            }
        }
        return answer;
    }
}