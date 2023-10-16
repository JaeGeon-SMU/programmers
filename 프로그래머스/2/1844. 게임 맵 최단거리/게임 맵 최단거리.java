import java.util.*;
class Solution {
    int answer = 99999;
    Queue<Node> q = new LinkedList();
    boolean[][] visit ;
    int[] xarr = {0,0,1,-1};
    int[] yarr = {1,-1,0,0};
    public int solution(int[][] maps) {
        visit = new boolean[maps.length][maps[0].length];
        for(int i = 0 ; i < maps.length; i++){
            for(int j = 0; j<maps[0].length; j++){
                if(maps[i][j] == 0)
                    visit[i][j] = true;
            }
        }
        q.add(new Node(0,0,1));
        bfs(maps);
        
        return answer ==99999? -1:answer;
    }
    public void bfs(int[][] maps){
        while(!q.isEmpty()){
            Node n = q.poll();
            int nx = n.x;
            int ny = n.y;
            if(nx==maps.length-1 && ny == maps[0].length-1)
                answer=Math.min(answer,n.cnt);
            
            for(int i = 0; i<4; i++){
                int nx2 = nx+xarr[i];
                int ny2 = ny+yarr[i];
                if(nx2<0 || ny2 <0 ||nx2>=maps.length || ny2>=maps[0].length) continue;
                if(visit[nx2][ny2]) continue;
                visit[nx2][ny2] = true;
                q.add(new Node(nx2,ny2,n.cnt+1));
            }
        }
    }
    class Node{
        int x,y,cnt;
        Node(int x,int y, int cnt){
            this.x= x;
            this.y = y;
            this.cnt = cnt;
        }
    }
}