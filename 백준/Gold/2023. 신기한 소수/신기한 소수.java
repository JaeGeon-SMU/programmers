import java.util.Scanner;

public class Main {
    static int n;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        dfs(2,1);
        dfs(3,1);
        dfs(5,1);
        dfs(7,1);

    }
    static boolean isPrime(int num){
        for(int i = 2; i*i<=num; i++){
            if(num%i ==0)
                return false;
        }
        return true;
    }
    static void dfs(int num,int length){
        if(isPrime(num)) {
            if(length==n)
                System.out.println(num);
            for (int i = 0; i < 10; i++) {
                dfs(num * 10 + i, length + 1);
            }
        }
    }
}

