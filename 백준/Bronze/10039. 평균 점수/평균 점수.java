import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a < 40) {
                a = 40;
            }
            arr[i] = a;
        }
        int avg = 0;
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        
        avg = sum / 5;
        System.out.println(avg);
    }
}