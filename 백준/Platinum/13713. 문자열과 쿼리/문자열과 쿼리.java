import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder(s).reverse();
        ArrayList<Integer> Z = ZFunction(sb.toString());
        int q = Integer.parseInt(br.readLine());
        for (int i = 0; i < q; i++) {
            int t = Integer.parseInt(br.readLine());
            System.out.println(Z.get(sb.length() - t));
        }
    }

    static ArrayList<Integer> ZFunction(String s) {
        int n = s.length(), l = -1, r = -1;
        ArrayList<Integer> Z = new ArrayList<>(Collections.nCopies(n, 0));
        Z.set(0, n);
        for (int i = 1; i < n; i++) {
            if (i <= r) Z.set(i, Math.min(r - i + 1, Z.get(i - l)));
            while (i + Z.get(i) < n && s.charAt(Z.get(i)) == s.charAt(i + Z.get(i))) {
                Z.set(i, Z.get(i) + 1);
            }
            if (r < i + Z.get(i) - 1) {
                l = i;
                r = i + Z.get(i) - 1;
            }
        }
        return Z;
    }
}