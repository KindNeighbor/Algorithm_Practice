import java.io.*;

public class Main {
    
    static int prime[] = new int[63250];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        boolean isPrime = false;
        
        for (int i = 0; i < 63250; i++) {
			prime[i] = 1;
		}
        
		prime[0] = 0;
		prime[1] = 0;

		for (int i = 2; i < 63250; i++) {
			for (int j = 2; i * j < 63250; j++) {

				prime[i * j] = 0;
			}
		}
        
        for (int i = 0; i < n; i++) {
            Long a = Long.parseLong(br.readLine());
            if (a <= 1) {
                System.out.println(2);
            } else {
                for (long j = a; ;  j++) {
                    int b = (int)Math.sqrt(j);
                    isPrime = true;
                    
                    for (int k = 1; k <= b; k++) {
                        if (prime[k] == 1) {
                                if (j % k == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }
                    if (isPrime) {
                       System.out.println(j);
                       break;
                    }
                }
            }
        }
    }
}