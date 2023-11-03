import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int s = sc.nextInt();
        int sum = 0;
        int[] arr = new int[cnt];
        int min = 100001;
        int idx = 0;
        for(int i = 0; i<cnt; i++){
            arr[i]=sc.nextInt();
        }
        for(int j = 0; j<cnt; j++){
            sum+=arr[j];
            if(sum>=s){
                min=Math.min(min,(j-idx)+1);
                while(sum>=s){
                    sum-=arr[idx++];
                    if(sum>=s)
                        min=Math.min(min,(j-idx)+1);
                }
            }
        }
        if(min==100001)
            min=0;
        System.out.println(min);
    }
}