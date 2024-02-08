import java.util.Scanner;


public class Main {
    static Character[][] arr;
    static boolean[][] visit;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        visit=new boolean[n][n];
        int cnt1 =0;
        arr= new Character[n][n];
        for(int i =0; i<n; i++){
            String s = sc.next();
            for(int j =0; j<n;j++){
                arr[i][j]=s.charAt(j);
            }
        }

        for(int i =0 ; i<n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visit[i][j]) {
                    dfs(j, i);
                    cnt1++;
                }
            }
        }
        System.out.print(cnt1+" ");
        for(int i =0; i<n; i++){
            for(int j =0; j<n;j++){
                if(arr[i][j]=='R')
                    arr[i][j]='G';
            }
        }
        cnt1 = 0;
        for(int i =0 ; i<n; i++) {
            for (int j = 0; j < n; j++) {
                visit[i][j]=false;
            }
        }
        for(int i =0 ; i<n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visit[i][j]) {
                    dfs(j, i);
                    cnt1++;
                }
            }
        }
        System.out.println(cnt1);

    }
    static void dfs(int x, int y){
        visit[y][x]=true;
        if(x+1<n &&!visit[y][x+1] && arr[y][x] == arr[y][x+1]) {
            dfs(x + 1, y);
        }if(x-1>=0 && !visit[y][x-1]&& arr[y][x] == arr[y][x-1]) {
            dfs(x - 1, y);
        }if(y+1<n && !visit[y+1][x]&& arr[y][x] == arr[y+1][x]){
            dfs(x,y+1);
        }if(y-1>=0 && !visit[y-1][x]&& arr[y][x] == arr[y-1][x]) {
            dfs(x, y - 1);
        }
    }

}
