
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[3];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 3; j++) {
                int a = Integer.parseInt(st.nextToken());
                arr[j] = a;
            }

            Arrays.sort(arr);
            int b = i + 1;
            if (arr[2] * arr[2] == (arr[0] * arr[0]) + (arr[1] * arr[1])) {
                System.out.println("Scenario #"+ b +":");
                System.out.println("yes");
                System.out.println();
            } else {
                System.out.println("Scenario #"+ b +":");
                System.out.println("no");
                System.out.println();
            }
        }

    }
}
