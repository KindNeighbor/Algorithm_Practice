class Solution {
    public int solution(String dartResult) {
        
        int q = 1;
        int first = 0;
        int second = 0;
        int third = 0;        
        
        for (int i = 0; i < dartResult.length(); i++) {
            if (dartResult.charAt(i) != 'S' && 
               dartResult.charAt(i) != 'D' &&
               dartResult.charAt(i) != 'T' &&
               dartResult.charAt(i) != '*' &&
               dartResult.charAt(i) != '#' &&
               q == 1) {
                if (dartResult.charAt(i+1) == '0') {
                    first = 10;
                } else if (first != 10) {
                    first = dartResult.charAt(i) - '0';
                }
            } else if (dartResult.charAt(i) == 'S' && q == 1) {
                first = first;
                if (dartResult.charAt(i+1) != '*' &&  dartResult.charAt(i+1) != '#') {
                    q += 1;
                }
            } else if (dartResult.charAt(i) == 'D' && q == 1) {
                first = first * first;
                if (dartResult.charAt(i+1) != '*' &&  dartResult.charAt(i+1) != '#') {
                    q += 1;
                }
            } else if (dartResult.charAt(i) == 'T' && q == 1) {
                first = first * first * first;
                if (dartResult.charAt(i+1) != '*' &&  dartResult.charAt(i+1) != '#') {
                    q += 1;
                }
            } else if (dartResult.charAt(i) == '*' && q == 1) {
                first *= 2;
                q += 1;
            } else if (dartResult.charAt(i) == '#' && q == 1) {
                first *= -1;
                q += 1;
            } else if (dartResult.charAt(i) != 'S' && 
               dartResult.charAt(i) != 'D' &&
               dartResult.charAt(i) != 'T' &&
               dartResult.charAt(i) != '*' &&
               dartResult.charAt(i) != '#' &&
               q == 2) {
                if (dartResult.charAt(i+1) == '0') {
                    second = 10;
                } else if (second != 10) {
                    second = dartResult.charAt(i) - '0';
                }
            } else if (dartResult.charAt(i) == 'S' && q == 2) {
                second = second;
                if (dartResult.charAt(i+1) != '*' &&  dartResult.charAt(i+1) != '#') {
                    q += 1;
                }
            } else if (dartResult.charAt(i) == 'D' && q == 2) {
                second = second * second;
                if (dartResult.charAt(i+1) != '*' &&  dartResult.charAt(i+1) != '#') {
                    q += 1;
                }
            } else if (dartResult.charAt(i) == 'T' && q == 2) {
                second = second * second * second;
                if (dartResult.charAt(i+1) != '*' &&  dartResult.charAt(i+1) != '#') {
                    q += 1;
                }
            } else if (dartResult.charAt(i) == '*' && q == 2) {
                second *= 2;
                first *= 2;
                q += 1;
            } else if (dartResult.charAt(i) == '#' && q == 2) {
                second *= -1;
                q += 1;
            } else if (dartResult.charAt(i) != 'S' && 
               dartResult.charAt(i) != 'D' &&
               dartResult.charAt(i) != 'T' &&
               dartResult.charAt(i) != '*' &&
               dartResult.charAt(i) != '#' &&
               q == 3) {
                if (dartResult.charAt(i+1) == '0') {
                    third = 10;
                } else if (third != 10) {
                    third = dartResult.charAt(i) - '0';
                }
            } else if (dartResult.charAt(i) == 'S' && q == 3) {
                third = third;
            } else if (dartResult.charAt(i) == 'D' && q == 3) {
                third = third * third;
            } else if (dartResult.charAt(i) == 'T' && q == 3) {
                third = third * third * third;
            } else if (dartResult.charAt(i) == '*' && q == 3) {
                third *= 2;
                second *= 2;
            } else if (dartResult.charAt(i) == '#' && q == 3) {
                third *= -1;
            }
        }
        return first + second + third;
    }
}