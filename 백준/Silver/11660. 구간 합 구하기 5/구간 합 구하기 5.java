import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); // 표의 크기
        int cnt = sc.nextInt(); // 합을 구해야 하는 횟수
        
        int[][] table = new int[size+1][size+1];
        
        for(int y=1; y<size+1; y++){
            for(int x=1; x<size+1; x++){
                table[y][x] = table[y-1][x]+table[y][x-1]+sc.nextInt()-table[y-1][x-1];
            }
        }
        
       
        
        // cnt번 반복
        for(int i = 0; i<cnt; i++){
            int y1 = sc.nextInt();
            int x1 = sc.nextInt();
            int y2 = sc.nextInt();
            int x2 = sc.nextInt();
            
            System.out.println(
                table[y2][x2]-
                table[y2][x1-1]-
                table[y1-1][x2]+
                table[y1-1][x1-1]);
        }
    }
}