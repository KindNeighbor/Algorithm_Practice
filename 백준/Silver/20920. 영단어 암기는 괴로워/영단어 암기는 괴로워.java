import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (s.length() >= M) {               
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }
        
        ArrayList<String> list = new ArrayList<>(map.keySet());
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String word1, String word2) {
                int a = map.get(word1);
                int b = map.get(word2);

                if(a == b){
                    if(word1.length() == word2.length()) {
                        return word1.compareTo(word2); 
                    }
                    return word2.length() - word1.length(); 
                }
                return b - a; 
            }
        });
        
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append("\n");
        }
        System.out.print(sb.toString());
    }
}