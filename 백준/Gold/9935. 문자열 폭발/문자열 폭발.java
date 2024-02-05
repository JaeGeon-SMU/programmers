import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> s = new Stack();
        StringBuilder sb =new StringBuilder();

        String ss= sc.next();
        String dest = sc.next();


        for(int i = 0 ; i<ss.length(); i++){
            char c = ss.charAt(i);
            s.push(c);
            sb.append(c);
            if(sb.length()>=dest.length()) {
                String sb2 = sb.substring(sb.length() - dest.length(), sb.length());
                if (sb2.equals(dest)) {
                    for (int j = 0; j < sb2.length(); j++) {
                        s.pop();
                    }
                    sb.delete(sb.length() - dest.length(), sb.length());
                }
            }
        }
        if(s.isEmpty()){
            System.out.println("FRULA");
        }
        else{
            System.out.println(sb.toString());
        }

    }
}