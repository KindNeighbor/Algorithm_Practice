import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            list.add(a);
        }
        
        Collections.sort(list);
        
        int max = 0;
        
        for (int i = 0; i < list.size(); i++) {
            int sum = list.get(i) * (list.size() - i);
            if (sum >= max) {
                max = sum;
            }
        }
        
        System.out.println(max);
    } 
}