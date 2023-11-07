import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		sc.nextLine();
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String s = sc.nextLine();
            int ans = 0;
            boolean flag = true; //true면 0이나오고 있는거
            for(int i=0; i<s.length(); i++){
            	if(flag && s.charAt(i)=='1'){
                    ans++;
                    flag = false;
                }
                else if (!flag && s.charAt(i)=='0'){
                    flag =true;
                    ans++;
                }
            }

            System.out.println("#"+test_case+" "+ans);
		}
	}
}