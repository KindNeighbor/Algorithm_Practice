import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int a = 3;
        for (int i = 1; i < N; i++) {
            a += Math.pow(2, i);
        }
        
        System.out.print(a * a);
    }
}