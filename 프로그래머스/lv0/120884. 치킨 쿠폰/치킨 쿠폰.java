class Solution {
    
    public int solution(int chicken) {
        
        int newChick = 0;
        int coup = chicken;
        int order = 0;

        while (coup >= 10) {
            order = coup / 10;
            newChick += order;
            coup = coup % 10 + order;
        }

        return newChick;
    }
}