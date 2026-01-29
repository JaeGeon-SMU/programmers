import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        int[] h = new int[n];
        StringBuilder sb = new StringBuilder();

        int cnt=1;
        for(int i =0;i<n; i++){
            w[i]=sc.nextInt();
            h[i] = sc.nextInt();
        }
        for(int j=0; j<n; j++){
            int w1 = w[j];
            int h1 = h[j];
            cnt =1;
            for(int i = 0; i<n; i++){
                int w2=w[i];
                int h2=h[i];
                if(w2>w1 && h2>h1){
                    cnt++;
                }
            }
            sb.append(cnt+" ");
        }
        
    System.out.print(sb);
    }
}