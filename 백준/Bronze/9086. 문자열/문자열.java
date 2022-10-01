
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String s1 = "";
        String s2 = "";

        for (int i = 0; i < T; i++) {
           s1 = br.readLine();
           s2 = String.valueOf(s1.charAt(0)) + String.valueOf(s1.charAt(s1.length() - 1));
           System.out.println(s2);
        }
    }
}