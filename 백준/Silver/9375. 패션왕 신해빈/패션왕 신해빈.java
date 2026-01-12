import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int cnt = sc.nextInt(); // n번 시행
        
        for(int i=0; i<cnt; i++){
            int cloth = sc.nextInt(); // 해당 시행 옷 개수
            int ans = 1;
            Map<String,Integer> clothes = new HashMap<String,Integer>();
            
            for(int j = 0; j<cloth; j++){
                String clothName = sc.next();
                String clothType = sc.next();
                clothes.put(clothType,clothes.getOrDefault(clothType,1)+1);
            }
           
            for(Integer val : clothes.values()){
                ans*=val;
            }
            System.out.println(ans-1);
        }
    }
}