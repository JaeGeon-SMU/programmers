import java.util.*;
class Solution {
    boolean[][] visit;
    String[][] map;
    int sum = 0;
    List<Integer> l = new ArrayList();
    public int[] solution(String[] maps) {
        
        map = new String[maps.length][maps[0].length()];
        visit = new boolean[maps.length][maps[0].length()];
        for(int i = 0 ; i<maps.length; i++){
            map[i] = maps[i].split("");
        }
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j<map[0].length; j++){
                if(!visit[i][j] && !map[i][j].equals("X")){
                    sum=Integer.valueOf(map[i][j]);
                    visit[i][j] = true;
                    bfs(i,j);
                    l.add(sum);
                }
            }
        }
        if(l.size()==0)
            l.add(-1);
        Collections.sort(l);
        int[] answer = new int[l.size()];
        for(int i = 0 ; i< l.size();i++)
            answer[i]=l.get(i);
        return answer;
    }
    void bfs(int y , int x){
        if(x+1 < map[0].length && !visit[y][x+1] && !map[y][x+1].equals("X")){
            visit[y][x+1]=true;
            sum+=Integer.valueOf(map[y][x+1]);
            bfs(y,x+1);
        }
        if(y+1 < map.length && !visit[y+1][x] && !map[y+1][x].equals("X")){
            visit[y+1][x]=true;
            sum+=Integer.valueOf(map[y+1][x]);
            bfs(y+1,x);
        }
        if(x>0 && !visit[y][x-1] && !map[y][x-1].equals("X")){
            visit[y][x-1] = true;
            sum+=Integer.valueOf(map[y][x-1]);
            bfs(y,x-1);
        }
        if(y>0 && !visit[y-1][x] && !map[y-1][x].equals("X")){
            visit[y-1][x] = true;
            sum+=Integer.valueOf(map[y-1][x]);
            bfs(y-1,x);
        }
    }
}