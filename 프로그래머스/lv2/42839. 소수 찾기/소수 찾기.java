import java.util.*;

class Solution {
    
    static HashSet<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        
        recursive("", numbers);
        int cnt = 0;
        
        for(int a : set) {
            if(isPrime(a)) {
                cnt++;
            }
        }
        
        return cnt;
    }
    
    public boolean isPrime(int num) {
        if(num == 0 || num == 1) return false;
        
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }
        
        return true;
    }
    
    public void recursive(String s, String t) {
        if(!s.equals("")) {
            set.add(Integer.valueOf(s));
        }
        
        for(int i = 0; i < t.length(); i++) {
            recursive(s + t.charAt(i), t.substring(0, i) + t.substring(i + 1)); 
        }
    }
}

