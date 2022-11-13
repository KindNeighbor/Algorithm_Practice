class Solution {
    public int solution(int[][] lines) {
        int[] check = new int[500];
        for (int i = lines[0][0]; i < lines[0][1]; i++) {
            if (i < 0) {
                int a = i;
                a += 300;
                check[a] += 1;
            } else {
                int b = i;
                check[b] += 1;
            }
        }
        
        for (int i = lines[1][0]; i < lines[1][1]; i++) {
            if (i < 0) {
                int a = i;
                a += 300;
                check[a] += 1;
            } else {
                int b = i;
                check[b] += 1;
            }
        }
        
        for (int i = lines[2][0]; i < lines[2][1]; i++) {
            if (i < 0) {
                int a = i;
                a += 300;
                check[a] += 1;
            } else {
                int b = i;
                check[b] += 1;
            }
        }
        int cnt = 0;
        for (int i = 0; i < 500; i++) {
            if (check[i] > 1) {
                cnt++;
            }
        }
        
        return cnt;
    }
}