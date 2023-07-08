class Solution {
    public String solution(String[] survey, int[] choices) {
        
        int R = 0; int T = 0;
        int C = 0; int F = 0;
        int J = 0; int M = 0;
        int A = 0; int N = 0;
        
        for (int i = 0; i < survey.length; i++) {
            if (choices[i] == 4) continue;
            
            switch(choices[i]) {
                case 1 : if (survey[i].charAt(0) == 'R') {
                    R += 3;
                } else if (survey[i].charAt(0) == 'T') {
                    T += 3;
                } else if (survey[i].charAt(0) == 'C') {
                    C += 3;
                } else if (survey[i].charAt(0) == 'F') {
                    F += 3;
                } else if (survey[i].charAt(0) == 'J') {
                    J += 3;
                } else if (survey[i].charAt(0) == 'M') {
                    M += 3;
                } else if (survey[i].charAt(0) == 'A') {
                    A += 3;
                } else if (survey[i].charAt(0) == 'N') {
                    N += 3;
                }
                    break;
                case 2 : if (survey[i].charAt(0) == 'R') {
                    R += 2;
                } else if (survey[i].charAt(0) == 'T') {
                    T += 2;
                } else if (survey[i].charAt(0) == 'C') {
                    C += 2;
                } else if (survey[i].charAt(0) == 'F') {
                    F += 2;
                } else if (survey[i].charAt(0) == 'J') {
                    J += 2;
                } else if (survey[i].charAt(0) == 'M') {
                    M += 2;
                } else if (survey[i].charAt(0) == 'A') {
                    A += 2;
                } else if (survey[i].charAt(0) == 'N') {
                    N += 2;
                } 
                    break;
                case 3 : if (survey[i].charAt(0) == 'R') {
                    R += 1;
                } else if (survey[i].charAt(0) == 'T') {
                    T += 1;
                } else if (survey[i].charAt(0) == 'C') {
                    C += 1;
                } else if (survey[i].charAt(0) == 'F') {
                    F += 1;
                } else if (survey[i].charAt(0) == 'J') {
                    J += 1;
                } else if (survey[i].charAt(0) == 'M') {
                    M += 1;
                } else if (survey[i].charAt(0) == 'A') {
                    A += 1;
                } else if (survey[i].charAt(0) == 'N') {
                    N += 1;
                } 
                    break;
                case 5 : if (survey[i].charAt(1) == 'R') {
                    R += 1;
                } else if (survey[i].charAt(1) == 'T') {
                    T += 1;
                } else if (survey[i].charAt(1) == 'C') {
                    C += 1;
                } else if (survey[i].charAt(1) == 'F') {
                    F += 1;
                } else if (survey[i].charAt(1) == 'J') {
                    J += 1;
                } else if (survey[i].charAt(1) == 'M') {
                    M += 1;
                } else if (survey[i].charAt(1) == 'A') {
                    A += 1;
                } else if (survey[i].charAt(1) == 'N') {
                    N += 1;
                } 
                    break;
                case 6 : if (survey[i].charAt(1) == 'R') {
                    R += 2;
                } else if (survey[i].charAt(1) == 'T') {
                    T += 2;
                } else if (survey[i].charAt(1) == 'C') {
                    C += 2;
                } else if (survey[i].charAt(1) == 'F') {
                    F += 2;
                } else if (survey[i].charAt(1) == 'J') {
                    J += 2;
                } else if (survey[i].charAt(1) == 'M') {
                    M += 2;
                } else if (survey[i].charAt(1) == 'A') {
                    A += 2;
                } else if (survey[i].charAt(1) == 'N') {
                    N += 2;
                } 
                    break;
                case 7 : if (survey[i].charAt(1) == 'R') {
                    R += 3;
                } else if (survey[i].charAt(1) == 'T') {
                    T += 3;
                } else if (survey[i].charAt(1) == 'C') {
                    C += 3;
                } else if (survey[i].charAt(1) == 'F') {
                    F += 3;
                } else if (survey[i].charAt(1) == 'J') {
                    J += 3;
                } else if (survey[i].charAt(1) == 'M') {
                    M += 3;
                } else if (survey[i].charAt(1) == 'A') {
                    A += 3;
                } else if (survey[i].charAt(1) == 'N') {
                    N += 3;
                } 
                    break;
            }
        }
        
        String ans = "";
        if (R > T) {
            ans += 'R';
        } else if (R < T) {
            ans += 'T';
        } else {
            ans += 'R';
        }
        
        if (C > F) {
            ans += 'C';
        } else if (C < F) {
            ans += 'F';
        } else {
            ans += 'C';
        }
        
        if (J > M) {
            ans += 'J';
        } else if (J < M) {
            ans += 'M';
        } else {
            ans += 'J';
        }
        
        if (A > N) {
            ans += 'A';
        } else if (A < N) {
            ans += 'N';
        } else {
            ans += 'A';
        }
        
        return ans;
    }
}