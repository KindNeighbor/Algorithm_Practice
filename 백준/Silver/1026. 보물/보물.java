import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr1 = new int[T];
        int[] arr2 = new int[T];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < T; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < T; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        Integer[] arr3 = Arrays.stream(arr2).boxed().toArray(Integer[]::new);

        Arrays.sort(arr1);
        Arrays.sort(arr3, Comparator.reverseOrder());

        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i] * arr3[i];
        }

        System.out.println(sum);
    }
}
