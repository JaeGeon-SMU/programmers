import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = 0;
        long[][]dp =new long[n+1][10];

        for(int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }

        for(int i=2;i<n+1;i++){
            for(int j =0; j<10; j++){
                if(j==0){
                    dp[i][j] = dp[i-1][j+1]%1000000000L;
                }
                else if(j==9){
                    dp[i][j] = dp[i-1][j-1]%1000000000L;
                }
                else{
                    dp[i][j] = (dp[i-1][j-1]+dp[i-1][j+1])%1000000000L;
                }
            }
        }


        for(int i = 0; i < 10; i++ ) {
            result += dp[n][i]%1000000000L;
        }
        System.out.println(result%1000000000L);
    }
}