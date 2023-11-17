import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int[][] arr = new int[401][401];
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum_x = 0;
            int sum_y = 0;
            int cnt = 1;
            for(int i = 1;i<401; i++){
            	for(int j = 1;j<=i; j++){
                	arr[i-j+1][j]=cnt++;
                    if(arr[i-j+1][j] == b){
                    	sum_y+=(i-j+1);
                        sum_x+=j;
                    }
                    if(arr[i-j+1][j] == a ){
                    	sum_y+=(i-j+1);
                        sum_x+=j;
                    }
                }
            }
            System.out.println("#"+test_case+" "+arr[sum_y][sum_x]);
			

		}
	}
}