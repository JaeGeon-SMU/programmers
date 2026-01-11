import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //정점의 개수 n
        int m = sc.nextInt(); //간선의 개수m

        List<Integer>[] arr = new ArrayList[n+1];
        boolean[] visited = new boolean[n+1];

        for(int i=1 ; i<n+1; i++){
            arr[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<m; i++){
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            arr[p1].add(p2);
            arr[p2].add(p1);
        }

        int count = 0;
        for(int i=1; i<n+1; i++){
            if(!visited[i]){
                count++;
                visited[i]=true;
                dfs(i, arr, visited);
            }
        }

        System.out.println(count);
    }

    public static void dfs(int idx, List<Integer>[] arr, boolean[] visited){
        for(int i=0; i<arr[idx].size(); i++){
            int p = arr[idx].get(i); // 해당 점에 연결된 친구 하나씩 꺼내서 dfs
            if(!visited[p]){
                visited[p]=true;
                dfs(p, arr, visited);
            }
        }
    }
}
