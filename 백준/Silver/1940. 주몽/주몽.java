import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n개의 재료
        int m = sc.nextInt(); // 갑옷 만드는 수  M
        int start = 0;
        int end = n-1;
        int ans = 0;
        List<Integer> arr = new ArrayList<Integer>();
        for(int i =0; i<n; i++){
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        
        //start + end 더해서 m보다 크면 end -- 하고
        //start +end 더한게 m보다 작아지면 start1올리고 end도 --
        while(end>start){
            int num = arr.get(start);
           int num2 = arr.get(end);
            if(num+num2 == m){
                ans++;
                start++;
                end--;
            }else if(num+num2>m){
                end--;
            }else{
                start++;
            }
        }
        System.out.print(ans);
    }
}