import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            BigInteger bigNumber = getCombination(M,N);
            System.out.println(bigNumber);
        }
    }

    public static BigInteger getCombination(int n, int r) {
        BigInteger pResult = BigInteger.valueOf(1);
        for (int i = n; i >= n - r + 1; i--) {
            pResult = pResult.multiply(BigInteger.valueOf(i));
        }

        BigInteger rResult = BigInteger.valueOf(1);
        for (int i = 1; i <= r; i++) {
            rResult = rResult.multiply(BigInteger.valueOf(i));
        }
        BigInteger Result = pResult.divide(rResult);
        return Result;
    }
}