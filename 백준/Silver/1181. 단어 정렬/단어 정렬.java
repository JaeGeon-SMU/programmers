import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet();
        int max = 0;
        Map<Integer,List<String>> map = new HashMap();
        int n = sc.nextInt();
        for(int i =0; i<n; i++){
            set.add(sc.next());
        }
        for(String s : set){
            if(max<s.length()) max= s.length();
            List<String> newList = map.getOrDefault(s.length(),new ArrayList<String>());
            newList.add(s);
            map.put(s.length(),newList);
        }
        for(int i =0;i<=max;i++){
            List<String> list = map.get(i);
            if(list !=null){
            Collections.sort(list);
            for(String ss : list){
                System.out.println(ss);
            }
            }
        }
    }
}