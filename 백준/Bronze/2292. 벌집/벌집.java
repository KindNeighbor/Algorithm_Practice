import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int rng = 2;
        
        if(N == 1) {
            System.out.println(1);
        }
        else {
            while(rng <= N) {
                rng = rng + (6*count);
                count++;
            }
            System.out.println(count);
        }
    }
}