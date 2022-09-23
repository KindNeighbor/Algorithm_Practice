import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);

        s1 = s1.replace('6', '5');
        s2 = s2.replace('6', '5');

        System.out.print(Integer.parseInt(s1) + Integer.parseInt(s2) + " ");

        s1 = s1.replace('5', '6');
        s2 = s2.replace('5', '6');

        System.out.print(Integer.parseInt(s1) + Integer.parseInt(s2));
    }
}