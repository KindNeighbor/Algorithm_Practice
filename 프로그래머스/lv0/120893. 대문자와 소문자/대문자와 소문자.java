class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= 97 && my_string.charAt(i) <= 122) {
                sb.append((char)(my_string.charAt(i) - 97 + 65));
            } else {
                sb.append((char)(my_string.charAt(i) - 65 + 97));
            }
        }
        
        return sb.toString();
    }
}