import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int cnt =sc.nextInt();
        sc.nextLine();
        int sum =0;
        char[] arr = sc.nextLine().toCharArray();
        for(int i = 0; i<arr.length ; i++){
            sum+= arr[i]-'0';
        }
        System.out.println(sum);
    }
}