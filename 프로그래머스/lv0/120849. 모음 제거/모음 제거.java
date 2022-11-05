class Solution {
    public String solution(String my_string) {
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            int cnt = 0;
            for (int j = 0; j < vowel.length; j++) {
                if (my_string.charAt(i) == vowel[j]) {
                    cnt++;
                }
            }
            
            if (cnt == 0) {
                sb.append(my_string.charAt(i));
            } else {
                continue;
            }
        }
        
        return sb.toString();
    }
}