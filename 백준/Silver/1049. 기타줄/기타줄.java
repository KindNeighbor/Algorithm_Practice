import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] pack = new int[M];
        int[] piece = new int[M];
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            pack[i] = Integer.parseInt(st.nextToken());
            piece[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(pack);
        Arrays.sort(piece);
        
        int min = Integer.MAX_VALUE;
        
        min = Math.min(((N / 6) + 1) * pack[0], N * piece[0]);    
        min = Math.min(min, ((N / 6)) * pack[0] + (N % 6) * piece[0]);
        System.out.println(min);
    }
}