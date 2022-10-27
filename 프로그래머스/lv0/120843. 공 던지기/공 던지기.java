class Solution {
    public int solution(int[] numbers, int k) {
        
        int idx = 0;
        int cnt = 0;
        int num = 0;
        
        while (cnt < k) {
            if (idx < numbers.length) {
                num = numbers[idx];
                idx += 2;
                cnt++;
            } else {
                idx %= numbers.length;
                num = numbers[idx];
                idx += 2;
                cnt++;
            }
        }
        
        return num;
    }
}