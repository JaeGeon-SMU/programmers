import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    static int ans;
    static int n;
    static String[] priceArr;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
            ans =0;
         	priceArr = sc.next().split("");
             n = sc.nextInt();
            if(n>priceArr.length)
                n=priceArr.length;
  			dfs(0,0);
            System.out.println("#"+test_case+" "+ans);      	
		}
   }
    static void dfs(int start ,int num){
      if(num==n){
          ans = Math.max(ans,Integer.valueOf(String.join("",priceArr)));
      }
       else{
           for(int i = start; i<priceArr.length-1; i++){
               for(int j = i+1; j<priceArr.length; j++){
                   String temp = priceArr[i]; priceArr[i] = priceArr[j]; priceArr[j] = temp;
                   dfs(i,num+1);
                   temp =priceArr[i] ;priceArr[i] = priceArr[j]; priceArr[j] = temp;
               }
           }
       }
    }
}
