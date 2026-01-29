import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int two=0;
        int five =0;
        int n = sc.nextInt();
        for(int i =2;i <=n; i++){
            int j = i;
            while(j%2==0){
                j/=2;
                two++;
            }
            while(j%5==0){
                j/=5;
                five++;
            }
        }
        System.out.println(Math.min(two,five));
    }
}