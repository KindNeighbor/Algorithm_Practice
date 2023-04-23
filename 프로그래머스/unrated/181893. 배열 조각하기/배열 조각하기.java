class Solution {
    public int[] solution(int[] arr, int[] query) {
        
        int start = 0;
        int end = 0;
        
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                end = start + query[i];
            } else {
                start += query[i];
            }
        }
        
        int[] empty = {-1};
        
        if (end - start == 0) {
            return empty;
        }
        
        int[] ans = new int[end - start];
        int idx = start;
        
        for (int i = 0; i < ans.length; i++) {
            ans[i] = arr[idx];
            idx++;
        }
        
        return ans;
    }
}