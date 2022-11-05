import java.util.*;

class Solution {
    public int solution(String s) {
        
        String[] sArr = s.split(" ");
        Stack<Integer> stack = new Stack<>();
        
        stack.add(Integer.parseInt(sArr[0]));
        
        for (int i = 1; i < sArr.length; i++) {
            if (sArr[i].equals("Z")) {
                stack.pop();
            } else {
                stack.add(Integer.parseInt(sArr[i]));
            }
        }          
        
        int length = stack.size();
        
        int sum = 0;
        
        for (int i = 0; i < length; i++) {
            sum += stack.pop();
        }
        
        return sum;
    }
}