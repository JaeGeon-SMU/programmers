import java.util.*;
class Solution {
    public int solution(int n, int[][] wires) {
        int answer = 101;
        Set<Integer> s = new HashSet();
        for(int i = 0 ; i<wires.length;i++){
            s.add(wires[i][0]);
            s.add(wires[i][1]);
        }
        for(int i = 0; i<wires.length; i++){
            for(int j = 0; j<wires.length; j++){
                Set<Integer> s1 = new HashSet();
                s1.add (wires[i][0]);
                for(int k = 0; k<wires.length; k++){
                    for(int a =0;a<wires.length;a++){
                        if(a!= i&& s1.contains(wires[a][0]) || s1.contains(wires[a][1])){
                            s1.add(wires[a][0]);
                            s1.add(wires[a][1]);
                        }
                    }
                }
                answer = Math.min(answer,Math.abs((s.size()-s1.size()) -s1.size()));
            }
        }
        return answer;
    }
}