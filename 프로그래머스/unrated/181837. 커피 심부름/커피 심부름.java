class Solution {
    public int solution(String[] order) {
        int sum = 0;
        for (int i = 0; i < order.length; i++) {
            if (order[i].contains("latte")) {
                sum += 5000;
            } else {
                sum += 4500;
            }
        }

        return sum;
    }
}