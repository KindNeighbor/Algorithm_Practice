import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 9; i++) {
            for (int a = i + 1; a < 9; a++) {
                for (int b = a + 1; b < 9; b++) {
                    for (int c = b + 1; c < 9; c++) {
                        for (int d = c + 1; d < 9; d++) {
                            for (int e = d + 1; e < 9; e++) {
                                for (int f = e + 1; f < 9; f++) {
                                    if (arr[i] + arr[a] + arr[b] +
                                        arr[c] + arr[d] + arr[e] + arr[f] == 100) {
                                        sb.append(arr[i]).append("\n")
                                            .append(arr[a]).append("\n")
                                            .append(arr[b]).append("\n")
                                            .append(arr[c]).append("\n")
                                            .append(arr[d]).append("\n")
                                            .append(arr[e]).append("\n")
                                            .append(arr[f]);
                                        System.out.println(sb);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}