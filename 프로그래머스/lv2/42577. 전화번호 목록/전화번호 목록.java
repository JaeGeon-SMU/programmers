import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        Map<Integer,String> map = new HashMap();
        int i = 0;
        Arrays.sort(phone_book);
        for(String s: phone_book)
            map.put(i++,s);     
        for(i = 0; i< phone_book.length-1;i++){
            if(map.get(i+1).indexOf(phone_book[i])==0)
                return false;
        }
        return true;
    }   
}