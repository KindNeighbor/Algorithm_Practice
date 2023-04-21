import java.io.*;

public class Main {

    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s = br.readLine()) != null) {
            sb = new StringBuilder();
            int n = Integer.parseInt(s);

            int num = 1;
            for (int i = 0; i < n; i++) {
                num *= 3;
            }

            for (int i = 0; i < num; i++) {
                sb.append('-');
            }

            recursion(0, num);
            System.out.println(sb.toString());
        }
    }

    public static void recursion(int start, int size) {
        if (size == 1) {
            return;
        }

        int changeSize = size / 3;
        
        for (int i = start + changeSize; i < start + changeSize * 2; i++) {
            sb.setCharAt(i, ' ');
        }

        recursion(start, changeSize);
        recursion(start + changeSize * 2, changeSize);
    }
}
