import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int x3 = Integer.parseInt(st.nextToken());
            int y3 = Integer.parseInt(st.nextToken());
            int x4 = Integer.parseInt(st.nextToken());
            int y4 = Integer.parseInt(st.nextToken());

            if (x2 < x3 || x4 < x1 || y4 < y1 || y2 < y3) {
                System.out.println("d");
            } else if (x1 == x4 || x2 == x3) {
                if (y1 == y4 || y3 == y2) {
                    System.out.println("c");
                } else {
                    System.out.println("b");
                }
            } else if (y3 == y2 || y4 == y1) {
                System.out.println("b");
            } else {
                System.out.println("a");
            }
        }
    }
}
