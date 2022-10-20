class Solution {
    public int[] solution(int money) {
        int cnt = 0;
        cnt = money / 5500;
        int restM = 0;
        restM = money - cnt * 5500;
        int[] arr = new int[2];
        arr[0] = cnt; arr[1] = restM;
        return arr;
    }
}