import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        String[] DayOfWeek = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] NumberOfDays = {0,31,28,31,30,31,30,31,31,30,31,30};
        int C = 0;
        String S;
        
        for(int i = 0; i < A; i++) {
            C = C + NumberOfDays[i];
        }
        C = C + B;
        S = DayOfWeek[C%7];
        System.out.print(S);
    }
}