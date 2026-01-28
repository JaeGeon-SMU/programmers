import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList();
        int title = 666;
        while(true){
            String s = Integer.toString(title++);
            if(s.contains("666")){
                list.add(s);
                if(list.size()==n)
                    break;
            }
        }
        System.out.print(list.get(n-1));
    }
}