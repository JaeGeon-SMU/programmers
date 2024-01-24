import java.util.*;
class Main{
    public static void main(String[] args){
        int min = 2147483647;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
       
        for(int i = 0; i<n; i++){
            for(int k = 0; k<3; k++){
                arr[i][k] = sc.nextInt();
            }
        }
        for(int i = 1; i<n; i++){
            arr[i][0] += Math.min(arr[i-1][1],arr[i-1][2]);
            arr[i][1] += Math.min(arr[i-1][0],arr[i-1][2]);
            arr[i][2] += Math.min(arr[i-1][0],arr[i-1][1]);
        }
        min = Math.min(Math.min(arr[n-1][0],arr[n-1][1]),arr[n-1][2]);
        System.out.println(min);
    }

}