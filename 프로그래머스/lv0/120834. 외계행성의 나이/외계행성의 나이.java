class Solution {
    public String solution(int age) {
        
        char[] c = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        String s = String.valueOf(age);
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            sb.append(c[s.charAt(i) - '0']);
        }
        
        return sb.toString();
    }
}