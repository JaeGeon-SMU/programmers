import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //알고리즘 공부도 할 겸 선택 정렬로 풀어보자
        int[] arr = new int[s.length()];
        for(int i = 0 ; i<arr.length; i++){
            arr[i] =s.charAt(i)-'0';
        }

        for(int i = 0; i<arr.length-1; i++){
            int min = i;
            int tmp = 0;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            tmp = arr[min];
            arr[min] = arr[i];
            arr[i] =tmp;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length-1; i>=0; i--){
            sb.append(arr[i]);
        }
        System.out.print(sb);
    }
}