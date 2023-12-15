class Solution
{
    public int solution(int [][]board){
        int ans = 1;
        int cnt = 0;
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                if(board[i][j]==0)
                    cnt++;
            }
        }
        if(cnt == board[0].length * board.length)
            return 0;
        for(int i = 1 ; i<board.length; i++){
            for(int j = 1; j<board[0].length; j++){
                if(board[i][j]==0) continue;
                board[i][j] = Math.min(Math.min(board[i-1][j],board[i][j-1]),board[i-1][j-1])+1;
                ans = Math.max(ans,board[i][j]);
            }
        }
        
        return ans*ans;
    }
    /*
    public int solution(int [][]board)
    {
        int answer = 0;
        int start = Math.min(board.length,board[0].length);
        
        for(int i = 0; i<start; i++){
            answer = find(board,start-i);
            if(answer>0)
                break;
        }
      
        return answer;
    }
    public int find(int[][] board,int size){
        for(int i = 0; i<board.length-size+1; i++){
            for(int j=0; j<board[0].length-size+1; j++){
                boolean flag=check(board,i,j,size);
                if(flag)
                    return size*size;
            }
        }
        return 0;
    }
    public boolean check(int[][] board,int y,int x,int size){
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                if(board[y+i][x+j]==0)
                    return false;
            }
        }
        return true;
    }
    */
}