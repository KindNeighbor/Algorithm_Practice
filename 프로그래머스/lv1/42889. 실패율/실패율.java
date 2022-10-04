import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        HashMap<Integer, Double> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            double sum_player = 0;
            double fail = 0;
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] > i) {
                    sum_player += 1;
                }

                if (stages[j] == i+1) {
                    fail += 1;
                }

            }

            if (sum_player == 0) {
                map.put(i + 1, (double)0);
            } else {
                double failRate = (fail / sum_player) * 100;
                map.put(i + 1, failRate);
            }
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2).compareTo(map.get(o1));
            }
        });
        int[] arr = new int[N];
        int size = 0;
        for (Integer item : list) {
            arr[size++] = item;
        }

        return arr;
    }
}