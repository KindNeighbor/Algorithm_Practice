
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 65 && c[i] <= 90) {
                c[i] = (char)(c[i] + 'a' - 'A');
            } else if (c[i] >= 97 && c[i] <= 122) {
                c[i] = (char)(c[i] + 'A' - 'a');
            }
        }
        String s1 = "";
        for (int i = 0; i < c.length; i++) {
            s1 += c[i];
        }

        System.out.println(s1);
    }
}