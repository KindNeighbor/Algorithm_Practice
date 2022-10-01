
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();

        char[] a = A.toCharArray();
        char[] b = B.toCharArray();

        String s = "";
        for (int i = 0; i < 8; i++) {
            s += a[i];
            s += b[i];
        }

        while (s.length() > 2) {
            String s1 = "";
            for (int i = 0; i < s.length() - 1; i++) {
                int val = ((s.charAt(i) - '0') + (s.charAt(i+1) - '0'));
                if (val >= 10) {
                    val -= 10;
                }
                String sVal = String.valueOf(val);
                s1 += sVal;
            }
            s = s1;
        }
        System.out.println(s);
    }
}