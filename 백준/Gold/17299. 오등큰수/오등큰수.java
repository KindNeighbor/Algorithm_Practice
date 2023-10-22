import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] cnt = new int[1000001];
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            cnt[arr[i]]++;
        }
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty() && cnt[arr[i]] > cnt[arr[stack.peek()]]) {
                arr[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        
        while (!stack.isEmpty()) {
            arr[stack.pop()] = -1;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append(" ");
        }
        
        System.out.println(sb);
    }
}