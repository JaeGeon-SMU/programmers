import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int ans =0;
        int[] arr = new int[n];
        for(int i =0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            int start =0;
            int end = n-1;
            int find = arr[i];
            while(start<end){
                if(arr[start]+arr[end]==find){
                    if(start==i)
                        start++;
                    else if(end ==i)
                        end--;
                    else {
                        ans++;
                        break;
                    }
                }
                else if(arr[start]+arr[end]<find)
                    start++;
                else if(arr[start]+arr[end]>find)
                    end--;
            }
        }
        System.out.println(ans);
    }
}