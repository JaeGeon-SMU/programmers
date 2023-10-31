import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> q = new LinkedList();
        for(int i = 0; i<truck_weights.length;){
            if(weight>=truck_weights[i]){
                q.add(truck_weights[i]);
                weight-=truck_weights[i];
                i++;
                answer++;
            }
            else{
                q.add(0);
                answer++;
            }
            if(q.size()>=bridge_length){
                weight+=q.poll();
            }
        }
        return answer+bridge_length;
    }
}