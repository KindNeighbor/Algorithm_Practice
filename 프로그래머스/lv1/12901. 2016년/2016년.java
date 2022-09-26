class Solution {
    public String solution(int a, int b) {
        String[] name_of_day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] dayNumber = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int sum = 0;
        for (int i = 0; i < a - 1; i++) {
            sum += dayNumber[i];
        }
        sum += b;
        int c = sum % 7;
        if (c == 0) {
            c = 7;
        }
        return name_of_day[c-1];
    }
}