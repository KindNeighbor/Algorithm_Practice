class Solution {
    public int solution(int num1, int num2) {
        double a = ((double)num1 / (double)num2); 
        double b = a * 1000;
        int c = (int)b;
        return c;
    }
}