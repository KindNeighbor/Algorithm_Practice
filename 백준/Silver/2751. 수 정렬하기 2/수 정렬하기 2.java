import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0; i<N; i++) {
            a.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(a);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            sb.append(a.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}