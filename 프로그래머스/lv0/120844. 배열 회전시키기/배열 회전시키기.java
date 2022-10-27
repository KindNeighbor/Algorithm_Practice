import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < numbers.length; i++) {
            dq.add(numbers[i]);
        }

        if (direction.equals("left")) {
            dq.addLast(dq.pollFirst());
        } else if (direction.equals("right")) {
            dq.addFirst(dq.pollLast());
        }

        int[] arr = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            arr[i] = dq.pollFirst();
        }

        return arr;
    }
}