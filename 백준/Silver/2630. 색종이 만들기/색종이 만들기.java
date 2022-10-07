import java.io.*;
import java.util.*;


public class Main {
    
    public static int white = 0;
    public static int blue = 0;
    public static int[][] a;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        a = new int[n][n];

        StringTokenizer st;

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            for(int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solution(0, 0, n);

        System.out.println(white);
        System.out.println(blue);

    }

    public static void solution(int row, int col, int size) {

        if(colorCheck(row, col, size)) {
            if(a[row][col] == 0) {
                white++;
            }
            else {
                blue++;
            }
            return;
        }

        int newboard = size / 2;
        solution(row, col, newboard);
        solution(row, col + newboard, newboard);
        solution(row + newboard, col, newboard);
        solution(row + newboard, col + newboard, newboard);	
    }
    
    public static boolean colorCheck(int row, int col, int size) {

        int color = a[row][col];

        for(int i = row; i < row + size; i++) {
            for(int j = col; j < col + size; j++) {
                if(a[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}