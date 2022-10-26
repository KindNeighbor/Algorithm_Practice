import java.util.*;

class Solution {
    public int solution(int n) {
        int num = 2;

        ArrayList<Integer> list = new ArrayList<>();

        while (n > 1) {
            int cnt = 0;
            while (true) {
                if (n % num == 0) {
                    n /= num;
                    cnt++;
                } else {
                    break;
                }
            }
            list.add(cnt);
            num++;
        }

        int sum = 1;
        for (int i = 0; i < list.size(); i++) {
            sum *= (list.get(i) + 1);
        }

        return sum;
    }
}