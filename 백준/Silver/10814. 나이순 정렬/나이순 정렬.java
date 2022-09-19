import java.io.*;
import java.util.*;

public class Main {

    public static class Var {
        int age;
        String name;

        public Var(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return age + " " + name + "\n";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        Var[] var = new Var[N];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            String b = st.nextToken();
            var[i] = new Var(a, b);
        }

        Arrays.sort(var, new Comparator<Var>() {
            @Override
            public int compare(Var var1, Var var2) {
                return var1.age - var2.age;
            }
        });

        for (int i = 0; i < N; i++) {
            sb.append(var[i]);
        }
        System.out.println(sb);
    }
}