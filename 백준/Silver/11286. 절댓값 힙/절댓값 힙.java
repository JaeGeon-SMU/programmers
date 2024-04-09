
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<A> pq = new PriorityQueue(new Comparator<A>() {
            @Override
            public int compare(A a1, A a2) {
                if(a1.ab_num==a2.ab_num){
                    return a1.num-a2.num;
                }else{
                    return a1.ab_num-a2.ab_num;
                }
            }
        });
        for(int i =0; i<n; i++){
            int num = sc.nextInt();
            if(num==0){
                if(!pq.isEmpty())
                    System.out.println(pq.poll().num);
                else
                    System.out.println(num);
            }
            else{
                A a = new A(Math.abs(num),num);
                pq.add(a);
            }
        }
    }
}

class A{
    int ab_num;
    int num;
    A(int ab_num,int num){
        this.ab_num = ab_num;
        this.num=num;
    }
}
