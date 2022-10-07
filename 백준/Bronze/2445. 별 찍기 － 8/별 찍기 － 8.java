import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for(int k = 2*i; k < 2*N-2; k++) {
                System.out.print(" ");
            }
            for(int l = 0; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < N-1; i++) {
            for(int j = i; j < N-1; j++) {
                System.out.print("*");
            }
            for(int k = 0; k < 2*i+2; k++) {
                System.out.print(" ");
            }
            for(int l = i; l < N-1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}