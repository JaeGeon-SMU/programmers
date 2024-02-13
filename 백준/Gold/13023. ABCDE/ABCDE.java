import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    static List<Integer>[] list;
    static int ans = 0;
    static boolean[] check;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        check = new boolean[n];
        list = new ArrayList[n];
        for(int i = 0 ; i<n; i++){
            list[i] = new ArrayList();
        }
        for(int i = 0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
            list[b].add(a);
        }
        for(int i = 0 ; i<n; i++){
            if(ans==0)
                dfs(i,0);
        }
        System.out.println(ans);
    }
    static void dfs(int i, int dep) {
        if (dep == 4) {
            ans = 1;
            return;
        } else {
            check[i] = true;
            for (int num : list[i]) {
                if (!check[num]) {
                    dfs(num, dep + 1);
                }
            }
            check[i] = false;
        }
    }
}