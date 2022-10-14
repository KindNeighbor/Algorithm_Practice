class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] arr = new int[2];
        int newDenum = denum1 * num2 + denum2 * num1;
        int newNum = num1 * num2;
        int newDenum1 = newDenum / gcd(newDenum, newNum);
        int newNum1 = newNum / gcd(newDenum, newNum);
        
        arr[0] = newDenum1;
        arr[1] = newNum1;
        return arr;
    }
    
    public int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}