import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N.length(); i++) {
            String s = Integer.toBinaryString(N.charAt(i) - '0');
            if (s.length() == 1) s = "00" + s;
            else if (s.length() == 2) s = "0" + s;
            sb.append(s);
        }

        if (sb.toString().charAt(0) == '0') {
            if (sb.toString().charAt(1) == '0') {
                System.out.println(sb.substring(2));
            } else {
                System.out.println(sb.substring(1));
            }
        } else {
            System.out.println(sb);
        }
    }
}
