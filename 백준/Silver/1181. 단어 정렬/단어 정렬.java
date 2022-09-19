import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] s_arr = new String[N];
        for (int i = 0; i < N; i++) {
            s_arr[i] = br.readLine();
        }
        Arrays.sort(s_arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length();
                }
            }
        });

        String s_idx = "";
        for (int i = 0; i < N; i++) {
            if (!s_arr[i].equals(s_idx)) {
                System.out.println(s_arr[i]);
                s_idx = s_arr[i];
            }
        }
    }
}