import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String reversedS = new StringBuilder(S).reverse().toString();
        int[] Z = calculateZ(reversedS);

        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            int query = Integer.parseInt(br.readLine());
            System.out.println(Z[Z.length - query]);
        }
    }
    
    static int[] calculateZ(String input) {
        int len = input.length();
        int[] Z = new int[len];
        Z[0] = len;

        int left = 0;
        int right = 0;
        for (int k = 1; k < len; k++) {
            if (k > right) {
                left = right = k;
                while (right < len && input.charAt(right - left) == input.charAt(right)) {
                    right++;
                }
                Z[k] = right - left;
                right--;
            } else {
                int k1 = k - left;
                if (Z[k1] < right - k + 1) {
                    Z[k] = Z[k1];
                } else {
                    left = k;
                    while (right < len && input.charAt(right - left) == input.charAt(right)) {
                        right++;
                    }
                    Z[k] = right - left;
                    right--;
                }
            }
        }
        return Z;
    }
}