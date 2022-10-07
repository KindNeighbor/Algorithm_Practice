import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int i = 0;
        while (true) {
            i++;
            st = new StringTokenizer(br.readLine(), " ");
            int r = Integer.parseInt(st.nextToken());

            if (r == 0) {
                break;
            }

            int w = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());

            if (w*w + l*l <= 4*r*r) {
                System.out.println("Pizza " + i + " fits on the table.");
            } else {
                System.out.println("Pizza " + i + " does not fit on the table.");
            }
        }
    }
}