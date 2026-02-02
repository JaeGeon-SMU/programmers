import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Point> l = new ArrayList();
        for(int i =0; i<n; i++){
            Point p = new Point(sc.nextInt(),sc.nextInt());
            l.add(p);
        }
        Collections.sort(l,(a,b)->{
            if(a.getX()==b.getX()){
                return a.getY()-b.getY();
            }else{
                return a.getX()-b.getX();
            }
        });
        for(int i = 0; i<n; i++){
            Point p = l.get(i);
            System.out.println(p.getX()+" "+p.getY());
        }
    }
    
    public static class Point{
        int x,y;
        Point(int x , int y){
            this.x = x;
            this.y = y;
        }
        public int getX(){
            return x;
        }
        public int getY(){
            return y;
        }
    }
}