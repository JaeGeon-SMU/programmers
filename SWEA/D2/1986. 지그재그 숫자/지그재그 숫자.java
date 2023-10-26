import java.util.Scanner;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int t = 1; t <= T; t++){
			int a=s.nextInt();
			System.out.println("#"+t+" "+(a%2!=0 ? (a+1)/2 : -a/2));
		}
	}
}