import java.io.*;
import java.util.*;

public class Main {

    public static int N,K;
    public static int cnt = 0;
    public static int[] sorted;
    public static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        sorted = new int[A.length];


        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(A, 0, A.length - 1);
        if (K > cnt) {
            System.out.println("-1");
        } else {
            System.out.println(list.get(K-1));
        }

    }

    public static void mergeSort(int[] arr, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(arr, p, q);
            mergeSort(arr, q + 1, r);
            merge(arr, p, q, r);
        }
    }

    public static void merge(int[] arr, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;

        while(i <= q && j <= r) {
            if (arr[i] <= arr[j]) {
                sorted[t++] = arr[i++];
            } else {
                sorted[t++] = arr[j++];
            }
        }

        while(i <= q) {
            sorted[t++] = arr[i++];
        }
        while(j <= r) {
            sorted[t++] = arr[j++];
        }

        i = p; t = 0;

        while(i <= r) {
            cnt++;
            list.add(sorted[t]);
            arr[i++] = sorted[t++];
        }
    }
}