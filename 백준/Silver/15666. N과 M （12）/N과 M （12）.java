import java.io.*;
import java.util.*;

public class Main{
    static int[] arr; //중복 제거한 기본 배열
    static int[] ans; 
    static StringBuilder sb = new StringBuilder();
    static int m;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //자연수 n개
        m = Integer.parseInt(st.nextToken()); //수열 길이
        ans = new int[m];
        
        TreeSet<Integer> tree = new TreeSet();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
            tree.add(Integer.parseInt(st.nextToken()));
        arr = new int[tree.size()];
        
        int cnt = 0;
        for(int val : tree){
            arr[cnt++] = val;
        }
        
        dfs(0,0);
        System.out.println(sb);
    }
    
    static void dfs(int start, int depth){
        if(depth==m){
            for(int val : ans)
                sb.append(val+" ");
            sb.append("\n");
            return;
        }
        
        //dfs를 돌리되 현재값보다 작은놈이 먼저 오지 않게
        for(int i=start ; i<arr.length; i++){
            ans[depth] = arr[i];
            dfs(i,depth+1);
        }
    }
}