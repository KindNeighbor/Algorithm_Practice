import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] s_arr1 = new String[N];
        String[] s_arr2 = new String[M];

        for (int i = 0; i < N; i++) {
            s_arr1[i] = br.readLine();
        }
        

        for (int i = 0; i < M; i++) {
            s_arr2[i] = br.readLine();
        }
        
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (s_arr1[i].equals(s_arr2[j])) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}