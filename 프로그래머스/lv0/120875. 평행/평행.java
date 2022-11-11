class Solution {
    public int solution(int[][] dots) {
        int[] dots1 = dots[0];
        int[] dots2 = dots[1];
        int[] dots3 = dots[2];
        int[] dots4 = dots[3];
        
        if (getGradient(dots1, dots2) == getGradient(dots3, dots4)) {
            return 1;
        } else if (getGradient(dots1, dots3) == getGradient(dots2, dots4)) {
            return 1;
        } else if (getGradient(dots1, dots4) == getGradient(dots2, dots3)) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public double getGradient(int[] x, int[] y) {
        double a = x[1] - y[1];
        double b = x[0] - y[0];
        
        if (b == 0) {
            return 10000;
        } else {
            return a / b;
        }
    }
}