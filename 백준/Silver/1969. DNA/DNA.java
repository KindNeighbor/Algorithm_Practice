import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        char[][] arr = new char[N][M];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().toCharArray();
        }
        
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < M; i++) {
            int[] counts = new int[4]; // A, C, G, T
            
            for (int j = 0; j < N; j++) {
                char nucleotide = arr[j][i];
                if (nucleotide == 'A') {
                    counts[0]++;
                } else if (nucleotide == 'C') {
                    counts[1]++;
                } else if (nucleotide == 'G') {
                    counts[2]++;
                } else if (nucleotide == 'T') {
                    counts[3]++;
                }
            }
            
            int maxCount = 0;
            char mostFrequent = ' ';
            for (int k = 0; k < 4; k++) {
                if (counts[k] > maxCount) {
                    maxCount = counts[k];
                    if (k == 0) mostFrequent = 'A';
                    else if (k == 1) mostFrequent = 'C';
                    else if (k == 2) mostFrequent = 'G';
                    else if (k == 3) mostFrequent = 'T';
                }
            }
            
            sb.append(mostFrequent);
            sum += N - maxCount;
        }
        
        System.out.println(sb);
        System.out.println(sum);
    }
}