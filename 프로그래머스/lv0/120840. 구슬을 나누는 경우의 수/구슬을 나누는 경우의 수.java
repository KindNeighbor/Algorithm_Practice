class Solution {
    public int solution(int balls, int share) {
        return dp(balls, share);
    }
    
    public int dp(int a, int b) {
        int[][] arr = new int[a+1][b+1];
        
        for (int i = 0; i <= b; i++) {
            arr[i][i] = 1;
        }
        for (int i = 0; i <= a; i++) {
            arr[i][0] = 1;
        }
        for (int i = 2; i <= a; i++) {
            for(int j = 1; j <= b; j++) {
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }
        return arr[a][b];
    }
}