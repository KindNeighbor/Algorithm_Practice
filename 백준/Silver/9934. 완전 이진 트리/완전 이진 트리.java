import java.io.*;
import java.util.*;

public class Main {
    
    static int size;
    static int[] node;
    static int h;
    static List<Integer>[] nodeList;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        size = (int)Math.pow(2, K) - 1;
        node = new int[size];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < size; i++) {
            node[i] = Integer.parseInt(st.nextToken());
        }
        
        h = (int)Math.ceil(Math.log(size)/Math.log(2)) + 1;
        nodeList = new ArrayList[h];
        for (int i = 0; i < h; i++) {
            nodeList[i] = new ArrayList<>();
        }
        
        sol(0, size - 1, 0);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < h; i++) {
            for (int nl : nodeList[i]) {
                sb.append(nl).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
    
    public static void sol(int s, int e, int depth) {
        if (s > e) return;
        int mid = (s + e) / 2;
        
        nodeList[depth].add(node[mid]);
        
        sol(s, mid-1, depth+1);
        sol(mid+1, e, depth+1);
    }
}