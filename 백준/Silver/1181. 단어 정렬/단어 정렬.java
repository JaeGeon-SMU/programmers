import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet();

        int n = sc.nextInt();
        for(int i =0; i<n; i++){
            set.add(sc.next());
        }
        List<String> list = new ArrayList(set);
        Collections.sort(list, (a,b) ->{
            if(a.length() != b.length()){
                return a.length() - b.length();
            }else{
                return a.compareTo(b);
            }
        });
        for(String s : list)
            System.out.println(s);
    }
}