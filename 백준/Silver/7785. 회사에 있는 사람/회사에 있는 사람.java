import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            String cond = st.nextToken();
            
            if (map.containsKey(name)) {
                map.remove(name);
            } else {
                map.put(name, 1);
            }
        }
        ArrayList<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, Collections.reverseOrder());
        for (String name : list) {
            System.out.println(name);
        }
    }
}