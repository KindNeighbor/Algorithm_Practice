class Solution {
    public String solution(String letter) {
        
        String[] s = letter.split(" ");
        
        String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","...."
                ,"..",".---","-.-",".-..","--","-.","---",".--.","--.-"
                ,".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < mos.length; j++) {
                if (s[i].equals(mos[j])) {
                    sb.append(alphabet[j]);
                }
            }
        }

        return sb.toString();
    }
}