import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            for(int k = i; k < N-1; k++) {
                System.out.print(" ");
            }
            for(int l = 0; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < N-1; i++) {
            for(int k = 0; k <= i; k++) {
                System.out.print(" ");
            }
            for(int l = i; l < N-1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}