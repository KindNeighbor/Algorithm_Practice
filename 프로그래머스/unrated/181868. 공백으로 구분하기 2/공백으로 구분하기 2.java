import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < answer.length; i++) {
            if (!answer[i].equals("")) {
                list.add(answer[i]);
            }
        }
        String[] a = new String[list.size()];
        for (int i = 0; i < a.length; i++) {
            a[i] = list.get(i);
        }
        return a;
    }
}