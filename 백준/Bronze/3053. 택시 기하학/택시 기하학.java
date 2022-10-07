import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int r = Integer.parseInt(br.readLine());

        double U_circle = r * r * Math.PI;
        double T_circle = 2 * r * r;
        System.out.println(U_circle);
        System.out.println(T_circle);

    }
}