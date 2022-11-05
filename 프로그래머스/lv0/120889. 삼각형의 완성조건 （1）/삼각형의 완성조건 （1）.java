class Solution {
    public int solution(int[] sides) {
        int max = Math.max(sides[0], Math.max(sides[1], sides[2]));
        int sum = sides[0] + sides[1] + sides[2];
        if (sum - max <= max) {
            return 2;
        } else {
            return 1;
        }
    }
}