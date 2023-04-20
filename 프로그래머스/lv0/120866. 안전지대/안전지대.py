def solution(board):
    answer = 0
    safe=[[0]*(len(board)+2) for n in range(len(board)+2)]
    for i in range(len(board)):
        for j in range(len(board)):
            if board[i][j]==1:
                safe[i+1][j+1]=1
                safe[i][j+1]=safe[i][j]=safe[i][j+2]=1
                safe[i+1][j]=safe[i+1][j+2]=1
                safe[i+2][j]=safe[i+2][j+1]=safe[i+2][j+2]=1
    for r in range(1,len(board)+1):
        for k in range(1,len(board)+1):
            if safe[r][k]==0:
                answer+=1
    return answer