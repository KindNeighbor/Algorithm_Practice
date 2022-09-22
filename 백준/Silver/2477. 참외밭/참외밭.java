import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list1.add(a);
            list2.add(b);
        }

        int maxI_W = 0;
        int maxI_H = 0;
        int maxW = 0;
        int maxH = 0;
        for (int i = 0; i < 6; i++) {
            if (list1.get(i) == 1 || list1.get(i) == 2) {
                if (maxW < list2.get(i)) {
                    maxW = list2.get(i);
                    maxI_W = i;
                }
            }

            if (list1.get(i) == 3 || list1.get(i) == 4) {
                if (maxH < list2.get(i)) {
                    maxH = list2.get(i);
                    maxI_H = i;
                }
            }
        }

        int wl = 0;
        int wr = 0;
        int hl = 0;
        int hr = 0;
        if (maxI_W - 1 == -1) {
            wl = 5;
        } else {
            wl = maxI_W - 1;
        }

        if (maxI_W + 1 == 6) {
            wr = 0;
        } else {
            wr = maxI_W + 1;
        }

        if (maxI_H - 1 == -1) {
            hl = 5;
        } else {
            hl = maxI_H - 1;
        }

        if (maxI_H + 1 == 6) {
            hr = 0;
        } else {
            hr = maxI_H + 1;
        }

        int blank_area = (Math.abs(list2.get(wr)-list2.get(wl))) * (Math.abs(list2.get(hr)-list2.get(hl)));
        int area = maxH * maxW - blank_area;
        int num = area * T;
        System.out.println(num);
    }
}