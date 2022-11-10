class Solution {
    public int solution(String my_string) {
        int sum = 0;
        for (int i = 0; i < my_string.length(); i++) {
            String num = "";
            while (Character.isDigit(my_string.charAt(i))) {
                num += my_string.charAt(i);
                if (i == my_string.length() - 1) {
                    break;
                }
                i++;
            }
            if (num.equals("")) {
                continue;
            } else {
                sum += Integer.parseInt(num);         
            }
        }
        
        return sum;
    }
}