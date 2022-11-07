class Solution {
    public int solution(int n) {
        String s = String.valueOf(n);
        char[] c = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum += Character.getNumericValue(c[i]);
        }
        
        return sum;
    }
}