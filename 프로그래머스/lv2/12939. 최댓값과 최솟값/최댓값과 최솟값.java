class Solution {
    public String solution(String s) {
        String[] s1 = s.split(" ");
        int[] arr = new int[s1.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s1[i]);
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        String s2 = Integer.toString(max);
        String s3 = Integer.toString(min);

        String sAns = s3 + " " + s2;
        return sAns;
    }
}