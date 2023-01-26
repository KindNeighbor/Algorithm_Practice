import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        String[] limitType = new String[terms.length];
        String[] limitDate = new String[terms.length];
        for (int i = 0; i < terms.length; i++) {
            String[] divide = terms[i].split("\\s");
            limitType[i] = divide[0];
            limitDate[i] = divide[1];
        }

        String[] todayDate = today.split("\\.");
        int todayYear = Integer.parseInt(todayDate[0]);
        int todayMonth = Integer.parseInt(todayDate[1]);
        int todayDay = Integer.parseInt(todayDate[2]);

        String[] divide1 = new String[privacies.length];
        String[] customerType = new String[privacies.length];
        for (int i = 0; i < privacies.length; i++) {
            String[] divide = privacies[i].split("\\s");
            divide1[i] = divide[0];
            customerType[i] = divide[1];
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < privacies.length; i++) {
            int[] customerYear = new int[privacies.length];
            int[] customerMonth = new int[privacies.length];
            int[] customerDay = new int[privacies.length];
            for (int j = 0; j < divide1.length; j++) {
                String[] divide = divide1[j].split("\\.");
                customerYear[j] = Integer.parseInt(divide[0]);
                customerMonth[j] = Integer.parseInt(divide[1]);
                customerDay[j] = Integer.parseInt(divide[2]);
            }

            int sum = 0;
            sum += (todayYear - customerYear[i]) * 12 * 28;
            sum += ((todayMonth- 1) - (customerMonth[i] - 1)) * 28;
            sum += todayDay - customerDay[i];

            int a = 0;
            for (int j = 0; j < limitType.length; j++) {
                if (limitType[j].equals(customerType[i])) {
                    a = 28 * Integer.parseInt(limitDate[j]);
                }
            }

            if (sum >= a) {
                list.add(i + 1);
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}