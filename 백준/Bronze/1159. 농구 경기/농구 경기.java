import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[26];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            arr[(int)(s.charAt(0) - 'a')]++;
        }
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for (int num : arr) {
            if (num >= 5) {
                sb.append((char)(idx + 97));
            }
            idx++;
        }
        if (sb.toString().equals("")) {
            System.out.println("PREDAJA");
        } else {
            System.out.println(sb);
        }
    }
}