class Solution {
    public int[] solution(int[] arr) {
        int a = 0;
        int idx = 0;
        for (int i = 0; i <= 10; i++) {
            if (Math.pow(2,i) - arr.length >= 0) {
                a = (int)Math.pow(2,i) - arr.length;
                idx = i;
                break;
            }
        }

        int c = (int)Math.pow(2,idx);

        if (a == 0) {
            return arr;
        } else {
            int[] ans = new int[c];
            for (int i = 0; i < arr.length; i++) {
                ans[i] = arr[i];
            }
            return ans;
        }
    }
}