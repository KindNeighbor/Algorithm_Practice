class Solution {
    public int solution(String[] babbling) {
        int ans = 0;

        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replaceAll("aya", "1");
            babbling[i] = babbling[i].replaceAll("ye", "2");
            babbling[i] = babbling[i].replaceAll("woo", "3");
            babbling[i] = babbling[i].replaceAll("ma", "4");

            int cnt = 0;
            for (int j = 0; j < babbling[i].length(); j++) {
                if (babbling[i].charAt(j) >= 48 && babbling[i].charAt(j) <= 57) {
                    cnt++;
                }
            }

            if (cnt == babbling[i].length()) {
                ans++;
            }
        }

        return ans;
    }
}