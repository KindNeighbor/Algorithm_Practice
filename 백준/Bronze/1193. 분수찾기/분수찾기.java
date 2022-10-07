import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int X = Integer.parseInt(br.readLine());
        int cross_count = 1; 
        int count_sum = 0;
        while(true) {
            if(X <= cross_count + count_sum) {
                if(cross_count%2 == 1) {
                    System.out.println((cross_count-(X-count_sum-1)) + "/" + (X-count_sum));
                    break;
                }
                else {
                    System.out.println((X-count_sum) + "/" + (cross_count-(X-count_sum-1)));
                    break;
                }
            } else {
                count_sum = cross_count + count_sum;
                cross_count++;
            }
        }
    }
}