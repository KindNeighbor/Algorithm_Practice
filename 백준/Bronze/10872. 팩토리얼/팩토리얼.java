import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N == 0) {
            System.out.print("1");
        } else {
            System.out.print(recursive(N));
        }
    }
    
    public static int recursive(int N) {
        int a = 1;
        if(N == 1) {
            return 1;
        }
        return N * recursive(N-1);
    }
}