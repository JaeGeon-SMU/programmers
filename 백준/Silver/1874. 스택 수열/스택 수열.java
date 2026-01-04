import java.util.*;

public class Main { 
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<Integer>();
        int n = sc.nextInt(); // 총 숫자 1~n 까지
        int start = 1;
        boolean flag = true;
        StringBuffer bf = new StringBuffer();
        
        int[] arr = new int[n];
        
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int j = 0; j<arr.length; j++){
            int currentArrNum = arr[j];
            if(currentArrNum>=start){
                while(currentArrNum>=start){
                    s.push(start++);
                    bf.append("+\n");
                }
                s.pop();
                bf.append("-\n");
            }else{
                int popNum = s.pop();
                if(popNum==currentArrNum){
                    bf.append("-\n");
                }else{
                    System.out.println("NO");
                    flag = false;
                    break;
                }
            }
        }
        if(flag) System.out.println(bf.toString());
    }
}