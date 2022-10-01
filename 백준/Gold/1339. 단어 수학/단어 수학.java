import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] alphabet = new int[26];
        String[] sArr = new String[N];
        for (int i = 0; i < N; i++) {
            sArr[i] = br.readLine();
        }

        for (int i = 0; i < N; i++) {
            int pow = (int)Math.pow(10, sArr[i].length() - 1);
            for (int j = 0; j < sArr[i].length(); j++) {
                alphabet[(int)sArr[i].charAt(j) - 'A'] += pow;
                pow /= 10;
            }
        }

        Arrays.sort(alphabet);
        int idx = 9;
        int sum = 0;
        for (int i = alphabet.length - 1; i >= 0; i--) {
            sum += alphabet[i] * idx;
            idx--;
        }
        System.out.println(sum);
    }
}