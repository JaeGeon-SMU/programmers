class Solution {
    public String solution(int n, int t, int m, int p) {
        Character[] arr = new Character[t*m];
        StringBuilder sb = new StringBuilder();
        int a = 0;
        int cnt = 0;
        while(a<arr.length){
            String cc = nc(n,cnt++);
            for(int j = 0; j<cc.length(); j++){
                arr[a++]=cc.charAt(j);
                if(a>=arr.length)
                    break;
            }
        }
        int idx = 0;
        while(idx<t){
            sb.append(arr[p-1+idx*m]);
            idx++;
        }
        return sb.toString();
    }
    String nc(int n,int target){
        StringBuilder sb = new StringBuilder();
        if(target==0)
            return "0";
        while(target>0){
            int a = target%n;
            if(a>=10){
                a+=55;
                sb.append((char)a);
            }                
            else
                sb.append(a);
            target/=n;
        }
        return sb.reverse().toString();
    }
}