import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i]=sc.nextInt();
        Arrays.sort(arr);
        int ans =0;
        for(int i =0;i<n;i++){
            int start = 0;
            int end = n-1;
            int find = arr[i];
            while(start<end){
                if(arr[start]+arr[end]==find){
                    if(i!=start && i!=end){
                        ans++;
                        break;
                    }
                    else if( i==start)
                        start++;
                    else
                        end--;
                }
                else if( arr[start] + arr[end]<find){
                    start++;
                }
                else
                    end--;
            }
        }
        System.out.println(ans);
    }
}