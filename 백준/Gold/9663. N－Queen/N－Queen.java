import java.util.Scanner;
class Main
{
    static int ans =0;
    static int[][] arr;
    public static void main(String args[]) throws Exception
    {    
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        arr = new int[n][n];
        dfs(0,0);           
        System.out.println(ans);    
    }
    static void dfs(int idx1,int cnt){
        if(idx1==arr.length){
            if(cnt == arr.length)  ans++;
        }
        else{
        for(int i = 0; i<arr.length; i++){
            if(arr[idx1][i] == 0){
                for(int j = idx1; j<arr.length; j++){
                    arr[j][i]++;
                }
                int u = i+1;
                    for(int k = idx1+1; k<arr.length; k++){
                        if(u<arr.length)
                            arr[k][u++]++;
                    }
                    u=i-1;
                    for(int k=idx1+1; k<arr.length; k++){
                        if(u>=0)
                            arr[k][u--]++;
                    }
                dfs(idx1+1,cnt+1);
                for(int j = idx1; j<arr.length; j++){
                        arr[j][i]--;
                }
                 u = i+1;
                    for(int k = idx1+1; k<arr.length; k++){
                        if(u<arr.length)
                            arr[k][u++]--;
                    }
                    u=i-1;
                    for(int k=idx1+1; k<arr.length; k++){
                        if(u>=0)
                            arr[k][u--]--;
                    }
                }
            }
        }
    }
}