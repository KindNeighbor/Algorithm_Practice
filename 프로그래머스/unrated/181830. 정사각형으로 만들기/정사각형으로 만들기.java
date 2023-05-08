class Solution {
    public int[][] solution(int[][] arr) {
        int a = arr.length;
        int b = arr[0].length;
        
        if (a == b) {
            return arr;
        }
        
        int c = Math.max(a,b);
        
        int[][] ans = new int[c][c];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                ans[i][j] = arr[i][j];
            }
        }

        return ans;
    }
}