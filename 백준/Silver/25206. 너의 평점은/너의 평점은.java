import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double score = 0;
        double scoreSum = 0;
        double creditSum = 0;
        double avg = 0;

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String major = st.nextToken();
            float credit = Float.parseFloat(st.nextToken());
            String s = st.nextToken();
            if (s.equals("A+")) score = 4.5;
            else if (s.equals("A0")) score = 4.0;
            else if (s.equals("B+")) score = 3.5;
            else if (s.equals("B0")) score = 3.0;
            else if (s.equals("C+")) score = 2.5;
            else if (s.equals("C0")) score = 2.0;
            else if (s.equals("D+")) score = 1.5;
            else if (s.equals("D0")) score = 1.0;
            else if (s.equals("F")) score = 0.0;
            else if (s.equals("P")) {
                score = 0.0;
                credit = 0;
            }
            scoreSum += credit * score;
            creditSum += credit;
        }

        avg = scoreSum / creditSum;
        System.out.println(avg);
    }
}