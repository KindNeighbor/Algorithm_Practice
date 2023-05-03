class Solution {
    public int[] solution(String my_string) {
        int[] ans = new int[52];
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= 'A' && my_string.charAt(i) <= 'Z') {
                ans[my_string.charAt(i) - 'A'] += 1;
            } else {
                ans[my_string.charAt(i) - 'a' + 26] += 1;
            }
        }
        
        return ans;
    }
}