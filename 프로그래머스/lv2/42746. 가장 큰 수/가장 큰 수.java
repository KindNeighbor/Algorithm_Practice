import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(String.valueOf(numbers[i]));
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        
        if (list.get(0).equals("0")) {
            return "0";
        }

        return sb.toString();
    }
}