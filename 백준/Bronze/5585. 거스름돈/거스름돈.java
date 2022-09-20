import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());
        int leftMoney = 1000 - money;
        int[] arr = {500, 100, 50, 10, 5, 1};

        int cnt = 0;
        int idx = 0;
        for (int i = 0; i < 6; i++) {
            if (leftMoney >= arr[i]) {
                idx = leftMoney / arr[i];
                leftMoney -= arr[i] * idx;
                cnt += idx;
            }    
            if (leftMoney == 0) {
                break;
            }
        }
        System.out.println(cnt);
    }
}