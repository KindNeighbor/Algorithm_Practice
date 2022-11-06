import java.util.*;

class Solution {
    public int solution(String my_string) {
        Queue<String> queue = new LinkedList<>();
        String[] sArr = my_string.split(" ");
        for (int i = 0; i < sArr.length; i++) {
            queue.offer(sArr[i]);
        }

        int n = Integer.parseInt(queue.poll());
        while (!queue.isEmpty()) {

            if (queue.peek().equals("+")) {
                queue.poll();
                n += Integer.parseInt(queue.poll());
            } else if (queue.peek().equals("-")) {
                queue.poll();
                n -= Integer.parseInt(queue.poll());
            }
        }

        return n;
    }
}