import java.io.*;
import java.util.*;

public class Main {

    public static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] s_arr = new String[N];
        for (int i = 0; i < N; i++) {
            s_arr[i] = br.readLine();
        }

        for (int i = 0; i < N; i++) {
            System.out.print(isPalindrome(s_arr[i]) + " " + cnt);
            System.out.println();
            cnt = 0;
        }
    }

    public static int recursion(String s, int l, int r) {
        cnt++;
        if(l >= r) {
            return 1;
        } else if (s.charAt(l) != s.charAt(r)) {
            return 0;
        } else {
            return recursion(s, l + 1, r - 1);
        }
    }

    public static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }
}