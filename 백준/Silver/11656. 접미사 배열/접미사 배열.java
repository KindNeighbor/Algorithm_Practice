import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] sArr = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                sb.append(s.charAt(j));
            }
            sArr[i] = sb.toString();
        }

        Arrays.sort(sArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < sArr.length; i++) {
            sb1.append(sArr[i]).append("\n");
        }

        System.out.println(sb1);
    }
}