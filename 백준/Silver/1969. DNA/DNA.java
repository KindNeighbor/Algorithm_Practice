import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        List<String> sList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            sList.add(s);
        }
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < M; i++) {
            int A = 0; int C = 0; int G = 0; int T = 0; 
            for (int j = 0; j < N; j++) {
                if (sList.get(j).charAt(i) == 'A') {
                    A += 1;
                } else if (sList.get(j).charAt(i) == 'C') {
                    C += 1;
                } else if (sList.get(j).charAt(i) == 'G') {
                    G += 1;
                } else if (sList.get(j).charAt(i) == 'T') {
                    T += 1;
                }
            }
            if (A > C && A > G && A > T) {
                sb.append('A');
                sum += N - A;
            } else if (C > A && C > G && C > T) {
                sb.append('C');
                sum += N - C;
            } else if (G > A && G > C && G > T) {
                sb.append('G');
                sum += N - G;
            } else if (T > A && T > C && T > G) {
                sb.append('T');
                sum += N - T;
            } else if (A == C && A > G && A > T) {
                sb.append('A');
                sum += N - A;
            } else if (A == G && A > C && A > T) {
                sb.append('A');
                sum += N - A;
            } else if (A == T && A > C && A > G) {
                sb.append('A');
                sum += N - A;
            } else if (C == G && C > A && C > T) {
                sb.append('C');
                sum += N - C;
            } else if (C == T && C > A && C > G) {
                sb.append('C');
                sum += N - C;
            } else if (G == T && G > A && G > C) {
                sb.append('G');
                sum += N - G;
            } else if (A == C && C == G && A > T) {
                sb.append('A');
                sum += N - A;
            } else if (A == C && C == T && A > G) {
                sb.append('A');
                sum += N - A;
            } else if (A == G && G == T && A > C) {
                sb.append('A');
                sum += N - A;
            } else if (C == G && G == T && C > A) {
                sb.append('C');
                sum += N - C;
            } else if (A == C && C == G && G == T) {
                sb.append('A');
                sum += N - A;
            }
        }
        System.out.println(sb);
        System.out.println(sum);
    }
}