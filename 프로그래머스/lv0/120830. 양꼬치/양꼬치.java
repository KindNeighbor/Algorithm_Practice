class Solution {
    public int solution(int n, int k) {
        int price1 = n * 12000;
        int price2 = k * 2000;
        int discount = 2000 * (n / 10);
        
        return price1 + price2 - discount;
    }
}