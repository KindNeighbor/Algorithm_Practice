import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double D = Double.parseDouble(st.nextToken());
        double h = Double.parseDouble(st.nextToken());
        double w = Double.parseDouble(st.nextToken());

        double x2 = (D * D)/(h * h + w * w);
        int nh = (int)(h * Math.sqrt(x2));
        int nw = (int)(w * Math.sqrt(x2));

        System.out.print(nh + " " + nw);


    }
}