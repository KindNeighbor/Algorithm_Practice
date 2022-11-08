class Solution {
    public String solution(String polynomial) {
        String[] s = polynomial.split(" ");

        int xCnt = 0;
        int cons = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() >= 2 && s[i].charAt(s[i].length() - 1) == 'x') {
                String coeff = s[i].substring(0, s[i].length() - 1);
                xCnt += Integer.parseInt(coeff);
            } else {
                if (s[i].equals("x")) {
                    xCnt += 1;
                } else if(s[i].equals("+")) {
                    continue;
                } else {
                    cons += Integer.parseInt(s[i]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        if (xCnt == 0 && cons != 0) {
            sb.append(cons);
            return sb.toString();
        } else if (xCnt != 0 && cons == 0) {
            if (xCnt == 1) {
                sb.append("x");
                return sb.toString();
            } else {
                sb.append(xCnt).append("x");
                return sb.toString();
            }
        } else {
            if (xCnt == 1) {
                sb.append("x").append(" ").append("+").append(" ").append(cons);
                return sb.toString();
            } else {
                sb.append(xCnt).append("x").append(" ").append("+").append(" ").append(cons);
                return sb.toString();
            }
        }
    }
}