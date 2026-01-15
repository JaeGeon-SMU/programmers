import java.io.*;
import java.util.*;

public class Main{
    static int[] arr; //기본 배열
    static int[] ans; //답 배열
    static int n,m;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        arr  = new int[n];
        ans = new int[m];
        visited = new boolean[n];
        st = new StringTokenizer(br.readLine());
        for(int i =0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        dfs(0);
        System.out.print(sb);
        
    }
    public static void dfs(int depth){
        if(depth==m){
            for(int i=0;i<m; i++){
                sb.append(ans[i]+" ");
            }
            sb.append("\n");
            return;
        }
        int last = -1;
        for(int i=0;i<n;i++){
            
            if(!visited[i] && last!=arr[i]){
                ans[depth]=arr[i];
                last=arr[i];
                visited[i]=true;
                dfs(depth+1);
                visited[i]=false;
            }
        }
    }
}