import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());       
        System.out.print(recursive(N));
    }
    
    public static int recursive(int N) {
        if(N <= 1) {
            return N;
        }
        return recursive(N-1) + recursive(N-2);
    }
}