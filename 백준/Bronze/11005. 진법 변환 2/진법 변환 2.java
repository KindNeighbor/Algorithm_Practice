import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        ArrayList<Character> list = new ArrayList<>();
        
        while (N > 0) {
            int a = N % B;
            if (a >= 10) {
                list.add((char)(a - 10 + 'A'));
            } else {
                list.add((char)(a + '0'));
            }
            N /= B;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i));
        }
        
        System.out.println(sb);
    }
}