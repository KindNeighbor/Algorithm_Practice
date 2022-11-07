class Solution {
    public int solution(int num, int k) {
        String sNum = String.valueOf(num);
        String idx = String.valueOf(k);
        int result = sNum.indexOf(idx);
        if (result == - 1) {
            return -1;
        } else {
            return result + 1;
        }
    }
}