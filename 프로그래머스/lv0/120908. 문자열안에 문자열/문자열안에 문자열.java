class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.replace(str2, "%");
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == '%') {
                return 1;
            }
        }
        return 2;
    }
}