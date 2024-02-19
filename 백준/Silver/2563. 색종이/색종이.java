import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]= new int[101][101];
        int cnt=0;
        int n =sc.nextInt();
         
        for(int i=0;i<n;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j=y; j<y+10;j++) {
                for(int z=x;z<x+10;z++) {
                    arr[j][z]=1;
                }
            }  
        }
        for(int i=0;i<100;i++) {
            for(int j=0;j<100;j++) {
                if(arr[i][j]==1) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt); 
    }   
}