import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            list.add(br.readLine());
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (list.get(j).length() > i) {
                    sb.append(list.get(j).charAt(i));
                } else {
                    continue;
                }
            }
        }
        
        System.out.print(sb);
    }
}