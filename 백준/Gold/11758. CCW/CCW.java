import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(x);
            list.add(y);
        }

        int Val = (list.get(0) * list.get(3) + list.get(2) * list.get(5) + list.get(4) * list.get(1))
                -(list.get(2) * list.get(1) + list.get(4) * list.get(3) + list.get(0) * list.get(5));

        if (Val == 0) {
            System.out.println(0);
        } else if (Val < 0) {
            System.out.println(-1);
        } else if (Val > 0) {
            System.out.println(1);
        }
    }
}
