import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int number = 1;
        int idx = 0;
        while (true) {
            for (int i = 0; i < 5; i++) {
                if (number % arr[i] == 0) {
                    idx++;
                }
            }
            if (idx >= 3) {
                break;
            }
            number++;
            idx = 0;
        }
        System.out.println(number);
    }
}