
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Score> pq = new PriorityQueue<>();

        StringTokenizer st;


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            pq.add(new Score(name, a, b, c));
        }

        while (!pq.isEmpty()) {
            Score s = pq.poll();
            System.out.println(s.name);
        }
    }

    public static class Score implements Comparable<Score> {
        String name;
        int Korean;
        int English;
        int Math;

        public Score(String name, int Korean, int english, int math) {
            this.name = name;
            this.Korean = Korean;
            English = english;
            Math = math;
        }

        @Override
        public int compareTo(Score score) {
            if (this.Korean == score.Korean) {
                if (this.English == score.English) {
                    if (this.Math == score.Math) {
                        return this.name.compareTo(score.name);
                    }
                    return score.Math - this.Math;
                }
                return this.English - score.English;
            }
            return score.Korean - this.Korean;
        }
    }
}
