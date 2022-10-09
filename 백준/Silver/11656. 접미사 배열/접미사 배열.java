import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(s.substring(i));
        }

        Collections.sort(list);

        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb1.append(list.get(i)).append("\n");
        }

        System.out.println(sb1);
    }
}