import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = 10000000;
        StringTokenizer sub = new StringTokenizer(br.readLine(), "-");
        
        while(sub.hasMoreTokens()) {
            int a = 0;
            
            StringTokenizer add = new StringTokenizer(sub.nextToken(), "+");
            
            while(add.hasMoreTokens()) {
                a = a + Integer.parseInt(add.nextToken());
            }
            
            if(n == 10000000) {
                n = a;
            } else {
                n = n - a;
            }
        }
        System.out.println(n);
    }
}