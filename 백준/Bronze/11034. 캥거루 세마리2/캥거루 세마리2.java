
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";

        while ((s = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(s," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            int gap = Math.max(B-A,C-B);
            int ans = gap - 1;
            System.out.println(ans);
        }
    }
}