import java.util.*;
class Solution {
    boolean[][] visit;
    int answer = 99999;
    Queue<Point> q = new LinkedList();
    int[][] arr = {{1,0},{-1,0},{0,1},{0,-1}};
    public int solution(int[][] maps) {
        q.add(new Point(0,0,1));
        visit=new boolean[maps.length][maps[0].length];
        visit[0][0]=true;
        for(int i = 0 ; i<maps.length;i++){
            for(int j =0 ; j<maps[0].length; j++){
                if(maps[i][j]==0)
                    visit[i][j]=true;
            }
        }
        bfs(maps);
        return answer==99999 ? -1 : answer;
    }
    public void bfs(int[][] maps){
        while(!q.isEmpty()){
            Point p = q.poll();
            if(p.x==maps.length-1 && p.y ==maps[0].length-1){
                answer = p.cnt;
                return;
            }
            
            for(int i = 0;i<4; i++){
                if(p.x+arr[i][0]<0||p.y+arr[i][1]<0) continue;
                if(p.x+arr[i][0]>maps.length-1||p.y+arr[i][1]>maps[0].length-1) continue;
                if(visit[p.x+arr[i][0]][p.y+arr[i][1]]) continue;
                visit[p.x+arr[i][0]][p.y+arr[i][1]] = true;
                q.add(new Point(p.x+arr[i][0],p.y+arr[i][1],p.cnt+1));
            }
        }
    }
    class Point{
        int x,y,cnt;
        Point(int x,int y,int cnt){
            this.x=x;
            this.y=y;
            this.cnt=cnt;
        }
    }
}
/*
class Solution {
    int answer =999999;
    int n,m;
    int[][] maps;
    public int solution(int[][] map) {     
        n=map.length;
        m=map[0].length;
        maps=map;
        dfs(1,0,0);       
        return answer ==999999 ? -1 : answer;
    }
    public void dfs(int cnt,int x, int y){
        if(cnt>=answer)
                return ; 
        if(x==n-1 && y==m-1)
            answer = cnt;
        else{
            if(y+1<m && maps[x][y+1]!=0){
                maps[x][y+1]--;
                dfs(cnt+1,x,y+1);
                maps[x][y+1]++;
            }
            if(y>=1  && maps[x][y-1]!=0){
                maps[x][y-1]--;
                dfs(cnt+1,x,y-1);
                maps[x][y-1]++;
            }
            if(x+1<n && maps[x+1][y]!=0){
                maps[x+1][y]--;
                dfs(cnt+1,x+1,y);
                maps[x+1][y]++;
            }
            if(x>=1 &&maps[x-1][y]!=0){
                maps[x-1][y]--;
                dfs(cnt+1,x-1,y);
                maps[x-1][y]++;
            }
        }
    }
}*/