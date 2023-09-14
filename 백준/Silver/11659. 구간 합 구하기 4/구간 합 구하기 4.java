import java.util.*;
class Main{
    public static void main(String[] args){
       Scanner sc =new Scanner(System.in);
       int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int[] arr2 = new int[n+1];
        
        arr2[0]=0;
        for(int k =1 ; k<arr2.length; k++){
            arr2[k]+=sc.nextInt()+arr2[k-1];
        }
        sc.nextLine();
        for(int i=0 ; i<m ; i++){
            System.out.println(-arr2[sc.nextInt()-1]+arr2[sc.nextInt()]);
        }
    }
}