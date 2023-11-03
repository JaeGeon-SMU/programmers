import java.util.*;
class Main{
    static boolean[] arr = new boolean[10];
    static int tg;
    static String stg;
    static int cnt;
    static int min;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        stg=sc.next();
        tg = Integer.valueOf(stg); cnt = sc.nextInt();

        for(int i = 0; i<cnt; i++)
            arr[sc.nextInt()]=true;
        min= Math.abs(tg-100);
        for(int i =0;i<arr.length;i++){
            if(!arr[i]){
                dfs(""+i);
            }
        }
        System.out.println(min);
    }
    static void dfs(String s){

        if(s.length()>6) {
            return;
        }
        else{
            for(int i =0;i<arr.length;i++){
                if(!arr[i]){
                    dfs(s+i);
                }
            }
        }
        min = Math.min(min,s.length()+Math.abs(Integer.valueOf(stg)-Integer.valueOf(s)));
    }
}