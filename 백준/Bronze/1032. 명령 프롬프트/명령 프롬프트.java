import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Character>[] sList = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            sList[i] = new ArrayList<>();
        }
        String ans = "";
        for (int i = 0; i < N; i++) {
            String s1 = br.readLine();
            ans = s1;
            char[] c = s1.toCharArray();
            for (int j = 0; j < c.length; j++) {
                sList[i].add(c[j]);
            }
        }

        boolean[] check = new boolean[sList[0].size()];

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < sList[0].size(); j++) {
                if (sList[i].get(j) != sList[i+1].get(j)) {
                    check[j] = true;
                }
            }
        }
        char[] cAns = ans.toCharArray();
        int idx = 0;
        for (int i = 0; i < check.length; i++) {
            if(check[i]) {
                idx = i;
                cAns[idx] = '?';
            }
        }

        String s2 = "";
        for (int i = 0; i < cAns.length; i++) {
            s2 += cAns[i];
        }

        System.out.println(s2);

    }
}