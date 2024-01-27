import java.util.*;
public class Main {
    static int row;
    static int col;
    static int[][] arr;
    static boolean[][] check;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        col = sc.nextInt();
        row = sc.nextInt();
        check = new boolean[col][row];
        arr = new int[col][row];
        for (int i = 0; i < col; i++) {
            String temp = sc.next();
            for (int j = 0; j < row; j++) {
                arr[i][j] = temp.charAt(j) - '0';
            }
        }
        check[0][0] = true;
        bfs(0, 0);
        System.out.println(arr[col - 1][row - 1]);

    }

    public static void bfs(int x, int y) {
        Queue<Spot> q = new LinkedList<>();
        q.add(new Spot(x, y));

        while (!q.isEmpty()) {
            Spot s = q.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = s.x + dx[i];
                int nextY = s.y + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >=col || nextY >= row) {
                    continue;
                }
                if (check[nextX][nextY] || arr[nextX][nextY] == 0) {
                    continue;
                }
                q.add(new Spot(nextX, nextY));
                arr[nextX][nextY] = arr[s.x][s.y] + 1;
                check[nextX][nextY] = true;
            }
        }
    }
}
class Spot{
    int x ;
    int y ;
    Spot(int x, int y){
        this.x = x;
        this.y = y;
    }
}