class Solution {
    public int solution(int hp) {
        
        int a = 0;
        int b = 0;

        if (hp >= 5) {
            a = hp / 5;
            hp = hp - a * 5;
        }

        if (hp >= 3) {
            b = hp / 3;
            hp = hp - b * 3;
        }

        return a + b + hp;
    }
}