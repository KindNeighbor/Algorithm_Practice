import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        
        kmp(s1, s2);       
    }
    
    public static void kmp(String s1, String s2) {
        int[] arr = table(s2);
        
        int l1 = s1.length(); 
        int l2 = s2.length();
        int idx = 0;
        int cnt = 0;
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < l1; i++) {
            while (idx > 0 && s1.charAt(i) != s2.charAt(idx)) {
                idx = arr[idx - 1];
            }
            
            if (s1.charAt(i) == s2.charAt(idx)) {
                if (idx == l2 - 1) {
                    sb.append((i - idx + 1) + " ");
                    cnt++;
                    idx = arr[idx];
                } else {
                    idx += 1;
                }
            }
        }
        
        System.out.println(cnt);
        System.out.println(sb.toString());
    }
    
    public static int[] table(String s) {
        int l = s.length();
        int[] t = new int[l];
        int idx = 0;
        for (int i = 1; i < l; i++) {
            while (idx > 0 && s.charAt(i) != s.charAt(idx)) {
                idx = t[idx - 1];
            }
            if (s.charAt(i) == s.charAt(idx)) {
                t[i] = ++idx;
            }
        }
        return t;
    }
}