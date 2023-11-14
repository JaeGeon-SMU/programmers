import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = 10;
		//윗 부분이 N극 아래 부분이 S극 
        //1은 N극  2는 S극 
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n = sc.nextInt();
            int[][] arr = new int[n][n];
            Deque<Integer> dq = new LinkedList();
            int ans = 0;
            for(int i = 0; i<n; i++){
            	for(int j = 0; j<n; j++){
                	arr[i][j] = sc.nextInt();
                }
            }
            
            for(int i = 0; i<n; i++){
            	for(int j =0;j<n;j++){
                	if(arr[j][i] != 0)
                        dq.add(arr[j][i]);
                }
                while(!dq.isEmpty() && dq.peek() !=1)
                    dq.poll();
                while(!dq.isEmpty() && dq.peekLast() !=2)
                    dq.pollLast();
                int pre = 1;
                boolean flag = false;
                while(!dq.isEmpty()){
                	int cur = dq.poll();
                   	if(!flag && pre != cur){
                        ans++;
                        flag = true;
                    }
                    else if(flag && pre !=cur){
                    	flag = false;
                    }
                    pre=cur;
                }
            }
            System.out.println("#"+test_case+" "+ans);
		}
	}
}