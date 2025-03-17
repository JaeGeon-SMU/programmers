class Solution {
    public String solution(String[] survey, int[] choices) {
        int[] arr= new int[8];
        // R,T,C,F,J,M,A,N 순서 점수
        int[] score = {3,2,1,0,-1,-2,-3};
        for(int i = 0; i<survey.length; i++){
            String s = survey[i];
            int idx = choices[i]-1;
            if(s.equals("AN")){
                arr[6]+=score[idx];
            }else if(s.equals("NA")){
                arr[7]+=score[idx];
            }else if(s.equals("RT")){
                arr[0]+=score[idx];
            }else if(s.equals("TR")){
                arr[1]+=score[idx];
            }else if(s.equals("CF")){
                arr[2]+=score[idx];
            }else if(s.equals("FC")){
                arr[3]+=score[idx];
            }else if(s.equals("JM")){
                arr[4]+=score[idx];
            }else if(s.equals("MJ")){
                arr[5]+=score[idx];
            }
        }
        StringBuilder sb = new StringBuilder();
        if(arr[0]<arr[1])
            sb.append("T");
        else
            sb.append("R");
        if(arr[2]<arr[3])
            sb.append("F");
        else
            sb.append("C");
        if(arr[4]<arr[5])
            sb.append("M");
        else
            sb.append("J");
        if(arr[6]<arr[7])
            sb.append("N");
        else
            sb.append("A");
        return sb.toString();
    }
}