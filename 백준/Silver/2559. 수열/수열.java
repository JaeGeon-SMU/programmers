import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int sum_cnt = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<=n-sum_cnt;i++){
            int temp = 0;
            for(int j = 0; j<sum_cnt; j++){
                temp+=arr[i+j];
            }
            if(temp>max)
                max =temp;
        }
        System.out.println(max);
    }
}