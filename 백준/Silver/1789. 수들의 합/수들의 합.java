import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long sum = 0;
        int cnt = 1;
        while(cnt++ > 0) {
            sum += cnt;
            if (sum >= N) {
                break;
            }
        }
        System.out.println(cnt - 1);
    }
}