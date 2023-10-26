import java.util.*;
class Solution {
    int answer = -1;
    Queue<Integer[]> q = new LinkedList();
    public int solution(int x, int y, int n) {
        q.add(new Integer[]{y,0});
        bfs(x,n);
        return answer;
    }
    void bfs(int x, int n){
        while(!q.isEmpty()){
            Integer[] arr = q.poll();
            if(arr[0] == x){
                answer =arr[1];
                break;
            }
            if(arr[0]%3==0){
                q.add(new Integer[]{arr[0]/3,arr[1]+1});
            }
            if(arr[0]%2==0){
                q.add(new Integer[]{arr[0]/2,arr[1]+1});
            }
            if(arr[0]-n>=x){
                q.add(new Integer[]{arr[0]-n,arr[1]+1});
            }
        }
    }
}