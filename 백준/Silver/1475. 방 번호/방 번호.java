import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9]; //0 ~ 8까지만
        int a = sc.nextInt();
        while(a>0){
            int n = a%10;
            a=a/10;
            if(n!=9){
                arr[n]++;
            }else{
                arr[6]++;
            }
        }
        arr[6]=(arr[6]+1)/2;
        int max =0;
        for(int i=0; i<9; i++)
            max=Math.max(max,arr[i]);
        System.out.println(max);
    }
}