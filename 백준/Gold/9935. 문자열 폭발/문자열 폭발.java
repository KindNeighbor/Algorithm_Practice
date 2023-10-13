import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s1.length(); i++) {
            stack.push(s1.charAt(i));
            
            if (stack.size() >= s2.length()) {
                boolean check = true;
                
                for (int j = 0; j < s2.length(); j++) {
                    if (stack.get(stack.size() - s2.length() + j) != s2.charAt(j)) {
                        check = false;
                        break;
                    }
                }
                
                if (check) {
                    for (int j = 0; j < s2.length(); j++) {
                        stack.pop();
                    }
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        int l = stack.size();
        for (int i = 0; i < l; i++) {
            sb.append(stack.get(i));
        }
        if (sb.length() == 0) System.out.println("FRULA");
        else System.out.println(sb);
    }
}