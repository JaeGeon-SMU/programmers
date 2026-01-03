import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 수의 개수
        int m = sc.nextInt(); // 합을 구해야 하는 횟수
        
        int[] arr = new int[n+1];
        
        for(int i = 1; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        int[] sumArr = new int[n+1];
        sumArr[0] = 0;
        for(int i=1; i<sumArr.length; i++){
            sumArr[i] = arr[i] + sumArr[i-1];
        }
        
        for(int i=0; i<m; i++){
            int start = sc.nextInt()-1;
            int end = sc.nextInt();
            System.out.println(sumArr[end]-sumArr[start]);
        }
    }
}