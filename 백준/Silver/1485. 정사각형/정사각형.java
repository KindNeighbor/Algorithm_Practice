import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                list.add(new ArrayList<>());
            }

            for (int j = 0; j < 4; j++) {
                st = new StringTokenizer(br.readLine());
                list.get(j).add(Integer.parseInt(st.nextToken()));
                list.get(j).add(Integer.parseInt(st.nextToken()));
            }

            double[] arr = new double[6];
            int idx = 0;
            for (int j = 0; j < 3; j++) {
                for (int k = j+1; k < 4; k++) {
                    arr[idx] = getDist(list.get(j).get(0), list.get(j).get(1)
                        ,list.get(k).get(0), list.get(k).get(1));
                    idx++;
                }
            }

            Arrays.sort(arr);

            if (arr[0] == arr[1] && arr[1] == arr[2]
                && arr[2] == arr[3] && arr[3] == arr[0]) {
                if (arr[4] != arr[5]) {
                    System.out.println(0);
                } else {
                    System.out.println(1);
                }
            } else {
                System.out.println(0);
            }
        }
    }

    public static double getDist(int a1, int b1, int a2, int b2) {
        return Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));
    }
}