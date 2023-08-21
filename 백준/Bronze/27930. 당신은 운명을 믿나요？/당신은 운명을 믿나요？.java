import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        int[] yonsei = {'Y','O','N','S','E','I'};
        int[] korea = {'K','O','R','E','A'};
        int kIdx = 0;
        int yIdx = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == yonsei[yIdx]) {
                yIdx += 1;
            } else if (c == korea[kIdx]) {
                kIdx += 1;
            } else if (c == yonsei[yIdx] && c == korea[kIdx]) {
                yIdx += 1;
                kIdx += 1;
            }
            
            if (yIdx == 5) {
                System.out.println("YONSEI");
                break;
            } else if (kIdx == 4) {
                System.out.println("KOREA");
                break;
            }
        }
    }
}