import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int sum=0;
        int[] arr = new int[cnt];
        sc.nextLine();
        for(int i = 0 ; i<cnt;i++){
            arr[i]=sc.nextInt();
            sum+= arr[i];
        }
        Arrays.sort(arr);
        System.out.println(((double)sum/(cnt*arr[cnt-1])*100));
    }
}