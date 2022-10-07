import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static double Distance(int a1, int b1, int a2, int b2) {
        return Math.sqrt(Math.pow(a1 - a2, 2) + Math.pow(b1 - b2, 2));
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int X1 = Integer.parseInt(st.nextToken());
        int Y1 = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int X2 = X1 + W;
        int Y2 = Y1 + H;
        int r = H/2;
        int Y_M = Y1 + r;
        int count = 0;
        for (int i = 0; i < P; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            if(X1 <= X && X <= X2 && Y1 <= Y && Y <= Y2) {
                count++;
            } else if((Distance(X,Y,X1,Y_M) <= r) || Distance(X,Y,X2,Y_M) <= r) {
                count++;
            }
        }
        System.out.println(count);
    }
}