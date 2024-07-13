import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        List<Integer> primes = primeNumber(N);
        
        int result = countPrime(N, primes);
        System.out.println(result);
    }
    
    public static List<Integer> primeNumber(int max) {
        boolean[] isPrime = new boolean[max + 1];
        List<Integer> primes = new ArrayList<>();
        
        for (int i = 2; i <= max; i++) {
            isPrime[i] = true;
        }
        
        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        for (int i = 2; i <= max; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        
        return primes;
    }
    
    public static int countPrime(int N, List<Integer> primes) {
        int count = 0;
        int sum = 0;
        int start = 0;
        
        for (int end = 0; end < primes.size(); end++) {
            sum += primes.get(end);
            
            while (sum > N && start <= end) {
                sum -= primes.get(start++);
            }
            
            if (sum == N) {
                count++;
            }
        }
        
        return count;
    }
}