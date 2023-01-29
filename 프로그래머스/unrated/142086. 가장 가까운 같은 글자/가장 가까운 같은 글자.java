class Solution {
    public int[] solution(String s) {
        char[] c = s.toCharArray();
        int[] ans = new int[s.length()];
        ans[0] = -1;
        for (int i = 1; i < s.length(); i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (c[j] == s.charAt(i)) {
                    min = i - j;
                    ans[i] = min;
                }
            }
            if (min == Integer.MAX_VALUE) {
                ans[i] = -1;
            }
        }

        return ans;
    }
}