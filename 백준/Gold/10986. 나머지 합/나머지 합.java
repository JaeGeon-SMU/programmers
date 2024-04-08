import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long ans =0;
        long[] arr = new long[n];
        long[] arr2 = new long[m];
        arr[0]=sc.nextInt();
        for(int i =1; i<n; i++){
            arr[i]=arr[i-1]+sc.nextInt()%m;
        }
        for(int i =0; i<n; i++){
            int idx= (int)arr[i]%m;
            if(idx==0)
                ans++;
            arr2[idx]++;
        }
        for(int i =0; i<m; i++){
            if(arr2[i]>1){
                ans+=(arr2[i]*(arr2[i]-1)/2);
            }
        }
        System.out.println(ans);
    }
}
