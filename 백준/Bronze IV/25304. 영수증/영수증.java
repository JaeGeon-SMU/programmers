import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        int total = 0;

        for(int i = 0; i < b; i++){
            int c = sc.nextInt(); // 각 물건의 가격
            int d = sc.nextInt(); // 각 물건의 개수
            total += c * d;
        }
        if(total == a){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}