import java.util.Comparator;

import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = Integer.MAX_VALUE;
        PriorityQueue<Point> q = new PriorityQueue(new Comparator<Point>() {

            @Override
            public int compare(Point o1, Point o2) {
                return o1.time-o2.time;
            }
        });
        boolean[] arr = new boolean[100001];
        q.add(new Point(a,0));
        arr[a]=true;
        while(!q.isEmpty()){
            Point p = q.poll();
            arr[p.pos]=true;
            if(p.pos==b) {
                System.out.println(p.time);
                return;
            }
            if((2*p.pos)>=0&&(2*p.pos)<=100000&&arr[2*p.pos]==false)
                q.add(new Point(2*p.pos,p.time));
            if((p.pos+1)>=0&&(p.pos+1)<=100000&&arr[p.pos+1]==false)
                q.add(new Point(p.pos+1,p.time+1));
            if((p.pos-1)>=0&&(p.pos-1)<=100000&&arr[p.pos-1]==false)
                q.add(new Point(p.pos-1,p.time+1));
        }
    }


}
class Point{
    int pos;
    int time;
    Point(int pos,int time){
        this.pos = pos;
        this.time= time;
    }

    public int getPos() {
        return pos;
    }
}
