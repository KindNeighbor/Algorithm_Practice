import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            String ss = "";
            for (int j = i; j < s.length(); j++) {
                ss = ss + s.substring(j, j+1);
                set.add(ss);
            }
        }
        System.out.println(set.size());
    }
}