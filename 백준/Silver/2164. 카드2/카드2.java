import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(sol(N));

    }

    public static int sol(int N) {
        Queue qu = new LinkedList();
        for(int i = 0; i < N; i++) {
            qu.offer(i+1);
        }
        
        while(qu.size() > 1) {
            qu.remove();
            int data = (int)qu.remove();
            qu.offer(data);
        }
        return (int)qu.remove();
    }
}