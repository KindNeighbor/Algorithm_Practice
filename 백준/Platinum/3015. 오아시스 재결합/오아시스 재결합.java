import java.io.*;
import java.util.*;

public class Main {
    
    static int N;
    static Stack<People> stack = new Stack<>();
    static long cnt;
    
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            People people = new People(a, 1);
            
            while (!stack.empty() && stack.peek().height <= a) {
                People peo = stack.pop();
                cnt += peo.cnt;
                if (peo.height == a) {
                    people.cnt += peo.cnt;
                }
            }
            if (!stack.empty()) cnt++;
            stack.push(people);
        }
        System.out.println(cnt);
    }
    
    public static class People {
        int height;
        int cnt;
        
        public People(int height, int cnt) {
            this.height = height;
            this.cnt = cnt;
        }
    }
}