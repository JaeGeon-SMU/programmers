import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] sum = new int[n+1][n+1];
        for(int i = 1 ; i<sum.length; i++){
            for(int j =1 ; j<sum.length ; j++){
                sum[i][j] = sum[i-1][j] + sum[i][j-1]-sum[i-1][j-1]+sc.nextInt();
            }
        }
        for(int k = 0 ; k<m; k++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            System.out.println(sum[x2][y2]-sum[x1-1][y2]-sum[x2][y1-1]+sum[x1-1][y1-1]);
        }
    }
}