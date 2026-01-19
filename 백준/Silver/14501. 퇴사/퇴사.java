import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n+1];
        for(int i = 1; i<n+1; i++){
            int day = sc.nextInt();
            int price = sc.nextInt();
            int idx = i+day-1;
            arr[i]=Math.max(arr[i-1],arr[i]);
            if(idx >= n+1){
                continue;
            }
            
            arr[idx] = Math.max(arr[idx],arr[i-1]+price);
        }
        System.out.print(arr[n]);
    }
}