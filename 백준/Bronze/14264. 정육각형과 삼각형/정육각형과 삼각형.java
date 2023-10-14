import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        System.out.println(0.5 * L * L * Math.sin(Math.toRadians(120)));
    }
}