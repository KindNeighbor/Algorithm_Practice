class Solution {
    public String solution(String my_string, int n) {
        char[] c = my_string.toCharArray();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < c.length; i++) {
            s2.append(multiplyString(c[i], n));
        }
        return s2.toString();
    }
    
    public String multiplyString(char c, int n) {
        
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < n; i++) {
            s1.append(c);
        }
        return s1.toString();
    }
}