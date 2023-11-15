import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T=10;
		for(int test_case = 1; test_case <= T; test_case++)
		{
			sc.nextInt();
            int[] arr = new int[8];
            for(int i = 0; i<8; i++){
            	arr[i] = sc.nextInt();
            }
			boolean flag = false;
            while(!flag){
            	for(int i = 0; i<8; i++){
                	arr[i]-=15;
                    if(arr[i] <= 0 )
                        flag = true;
                }
            }
            for(int i = 0; i<8; i++){
            	arr[i]+=15;
            }
            
            flag = false;
            while(!flag){
            	for(int i = 0; i<5; i++){
                	arr[0]-=(i+1);
                    int temp = arr[0];
                    for(int k=1; k<8; k++){
                    	arr[k-1]=arr[k];
                    }
                    arr[7] = temp;
                    if(arr[7] <=0){
                        arr[7]=0;
                        flag = true;
                        break;
                    }
                }
            }
           
             System.out.print("#"+test_case+" ");
            for(int i = 0 ; i <8 ; i++)
            {
                	System.out.print(arr[i]+" ");
            }
              System.out.println();
			
           
		}
	}
}