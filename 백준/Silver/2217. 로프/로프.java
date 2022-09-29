import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            list2.add(list.get(i)*(list.size()-i));
        }
        Collections.sort(list2);
        System.out.println(list2.get(list2.size() - 1));
    }
}
