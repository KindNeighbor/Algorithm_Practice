class Solution {
    public int solution(String t, String p) {
        int l = p.length();
        int cnt = 0;

        for (int i = 0; i < t.length(); i++) {
            StringBuilder sb = new StringBuilder();
            if (i + l == t.length() + 1) {
                break;
            }
            for (int j = i; j < i + l; j++) {
                sb.append(t.charAt(j));
            }

            String newString = "";

            if (sb.toString().charAt(0) == '0' && sb.toString().length() > 1) {
                newString = sb.toString().substring(1);
            } else {
                newString = sb.toString();
            }

            if (Long.parseLong(newString) <= Long.parseLong(p)) {
                cnt++;
            }
        }

        return cnt;
    }
}