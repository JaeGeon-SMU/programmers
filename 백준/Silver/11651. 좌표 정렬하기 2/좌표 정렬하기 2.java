import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Point> points = new ArrayList();
        for(int i = 0; i<n; i++){
            Point p = new Point(sc.nextInt(),sc.nextInt());
            points.add(p);
        }
        Collections.sort(points,(a,b) ->{
            if(a.getY()==b.getY()){
                return a.getX()-b.getX();
            }else{
                return a.getY()-b.getY();
            }
        });
        for(Point p : points){
            System.out.println(p.getX() +" " + p.getY());
        }
    }
    
    public static class Point{
    int x;
    int y;
    Point(int x , int y){
        this.x = x;
        this.y = y;
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
}
}

