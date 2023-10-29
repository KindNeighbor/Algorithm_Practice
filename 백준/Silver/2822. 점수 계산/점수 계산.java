import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[5];
        
        for (int i = 0; i < 8; i++) {
            map.put(i+1, Integer.parseInt(br.readLine()));
        }
        
        ArrayList<Integer> keySet = new ArrayList<>(map.keySet());

        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        
        int sum = 0;
        int idx = 0;
        for (int a : keySet) {
            if (idx == 5) break;
            sum += map.get(a);
            arr[idx] = a;
            idx++;
        }
        
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(arr[i]).append(" ");
        }
        
        System.out.println(sum);
        System.out.println(sb);
    }
}