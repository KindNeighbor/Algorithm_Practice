class Solution {
    public int solution(String[] spell, String[] dic) {
        char[] cSpell = new char[spell.length];
        for (int i = 0; i < spell.length; i++) {
            cSpell[i] = spell[i].charAt(0);
        }

        int[] arr;

        for (int i = 0; i < dic.length; i++) {
            int cnt = 0;
            arr = new int[spell.length];
            for (int j = 0; j < dic[i].length(); j++) {
                for (int k = 0; k < cSpell.length; k++) {
                    if (dic[i].charAt(j) == cSpell[k]) {
                        arr[k]++;
                    }
                }
            }

            for (int k = 0; k < arr.length; k++) {
                if (arr[k] >= 1) {
                    cnt++;
                }
            }
            if (cnt == cSpell.length) {
                return 1;
            }
        }

        return 2;
    }
}