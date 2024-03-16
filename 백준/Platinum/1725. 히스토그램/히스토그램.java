import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(getArea(arr));
    }

    public static long getArea(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        long maxArea = 0;
        long width = 0;

        for (int i = 0; i < arr.length; i++) {
            while ((!stack.isEmpty()) && arr[stack.peek()] >= arr[i]) {
                long height = arr[stack.pop()];

                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - 1 - stack.peek();
                }
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            long height = arr[stack.pop()];

            if (stack.isEmpty()) {
                width = arr.length;
            } else {
                width = arr.length - 1 - stack.peek();
            }
            maxArea = Math.max(maxArea, width * height);
        }
        return maxArea;
    }
}