import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
             
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        while(st.hasMoreTokens()) {
            boolean Prime = true;
            
            int a = Integer.parseInt(st.nextToken());
            
            if(a == 1) {
                continue;
            }
            for(int i=2; i<a; i++) {
                if(a % i == 0) {
                    Prime = false;
                    break;
                }
            }
            if(Prime) {
                count++;
            }
        }
        System.out.println(count);
    }
}