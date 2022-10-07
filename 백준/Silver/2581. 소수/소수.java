import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static boolean prime[];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
        
        prime = new boolean[N + 1];
        getPrime();
        
        int sum = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i=M; i<=N; i++) {
            if(prime[i] == false) {
                sum += i;
                if(min == Integer.MAX_VALUE) {
                    min = i;
                }
            }
        }
        if(sum == 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
    
    public static void getPrime() {
        prime[0] = true;
        prime[1] = true;
        
        for(int i = 0; i<Math.sqrt(prime.length); i++) {
            if(prime[i] == true) {
                continue;
            }
            for(int j = i*i; j<prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}