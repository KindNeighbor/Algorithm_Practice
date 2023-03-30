// 2503번 - 숫자 야구

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> numberList = new ArrayList<>();
        int[] strike = new int[N];
        int[] ball = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            numberList.add(Integer.parseInt(st.nextToken()));
            strike[i] = Integer.parseInt(st.nextToken());
            ball[i] = Integer.parseInt(st.nextToken());
        }

        int ans = 0;

        for (int i = 123; i <= 987; i++) {

            int cnt = 0;

            if (String.valueOf(i).charAt(0) == String.valueOf(i).charAt(1) ||
                String.valueOf(i).charAt(1) == String.valueOf(i).charAt(2) ||
                String.valueOf(i).charAt(0) == String.valueOf(i).charAt(2) ||
                String.valueOf(i).charAt(1) == '0' ||
                String.valueOf(i).charAt(2) == '0') {
                continue;
            }

            for (int j = 0; j < N; j++) {

                int tempStrike = 0;
                int tempBall = 0;

                for (int k = 0; k < 3; k++) {
                    if (String.valueOf(numberList.get(j)).charAt(k) == String.valueOf(i).charAt(k)) {
                        tempStrike++;
                    }
                }

                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (String.valueOf(numberList.get(j)).charAt(k) == String.valueOf(i).charAt(l)) {
                            if (k != l) {
                                tempBall++;
                            }
                        }
                    }
                }

                if (tempStrike == strike[j] && tempBall == ball[j]) {
                    cnt++;
                }
            }
            if (cnt == N) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
