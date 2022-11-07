class Solution {
    public String[] solution(String[] quiz) {
        
        String[] arr = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            
            int ans = Integer.MIN_VALUE;
            String[] s = quiz[i].split(" ");
            
            if (s[1].equals("+")) {
                ans = Integer.parseInt(s[0]) + Integer.parseInt(s[2]);
            } else if (s[1].equals("-")) {
                ans = Integer.parseInt(s[0]) - Integer.parseInt(s[2]);
            }

            if (ans == Integer.parseInt(s[4])) {
                arr[i] = "O";
            } else {
                arr[i] = "X";
            }
        }

        return arr;
    }
}