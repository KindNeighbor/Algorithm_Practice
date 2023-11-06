import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int l = s.length();
        ArrayList<String> list = new ArrayList<>();
        for (int a = 1; a < l; a++) {
            for (int b = a + 1; b < l; b++) {
                list.add(sol(s, a, b));
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }
    
    public static String sol(String s, int a, int b) {
        StringBuilder s1 = new StringBuilder(s.substring(0, a));
        StringBuilder s2 = new StringBuilder(s.substring(a, b));
        StringBuilder s3 = new StringBuilder(s.substring(b));
        StringBuilder sb = new StringBuilder();
        sb.append(s1.reverse()).append(s2.reverse()).append(s3.reverse());
        return sb.toString();
    }
}