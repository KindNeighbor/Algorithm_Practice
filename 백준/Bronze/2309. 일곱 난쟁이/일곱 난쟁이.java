import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        int indexA = 0;
        int indexB = 0;
        for (int i = 0; i < list.size(); i++) {
            int a = 0;
            for (int j = i + 1; j < list.size(); j++) {
                a = sum - list.get(i) - list.get(j);
                if (a == 100) {
                    indexA = list.get(i);
                    indexB = list.get(j);
                    break;
                }
            }
            if (a == 100) {
                break;
            }
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == indexA || list.get(i) == indexB) {
                continue;
            }

            list2.add(list.get(i));
            if (list2.size() == 7) {
                break;
            }
        }

        Collections.sort(list2);

        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }
}
