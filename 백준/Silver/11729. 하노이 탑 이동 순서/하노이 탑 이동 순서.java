import java.io.*;
import java.util.*;

public class Main {
    
    public static StringBuilder sb = new StringBuilder();
     
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        sb.append((int)(Math.pow(2, N) - 1)).append("\n");
        solution(N, 1, 2, 3);
		System.out.println(sb);
 
    }
    
    public static void solution(int N, int a, int b, int c) {
        if(N == 1) {
            sb.append(a + " " + c + "\n");
            return;
        }
        solution(N-1, a, c, b);
        sb.append(a + " " + c + "\n");
        solution(N-1, b, a, c);
    }
}