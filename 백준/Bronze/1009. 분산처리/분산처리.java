import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int c = a % 10;

            switch (c) {
                case 0 :
                    System.out.println("10");
                    break;
                case 1 :
                    System.out.println("1");
                    break;
                case 2 :
                    if (b % 4 == 0) {
                        System.out.println("6");
                    } else if (b % 4 == 1) {
                        System.out.println("2");
                    } else if (b % 4 == 2) {
                        System.out.println("4");
                    } else if (b % 4 == 3) {
                        System.out.println("8");
                    }
                    break;
                case 3 :
                    if (b % 4 == 0) {
                        System.out.println("1");
                    } else if (b % 4 == 1) {
                        System.out.println("3");
                    } else if (b % 4 == 2) {
                        System.out.println("9");
                    } else if (b % 4 == 3) {
                        System.out.println("7");
                    }
                    break;
                case 4 :
                    if (b % 2 == 0) {
                        System.out.println("6");
                    } else {
                        System.out.println("4");
                    }
                    break;
                case 5 :
                    System.out.println("5");
                    break;
                case 6 :
                    System.out.println("6");
                    break;
                case 7 :
                    if (b % 4 == 0) {
                        System.out.println("1");
                    } else if (b % 4 == 1) {
                        System.out.println("7");
                    } else if (b % 4 == 2) {
                        System.out.println("9");
                    } else if (b % 4 == 3) {
                        System.out.println("3");
                    }
                    break;
                case 8 :
                    if (b % 4 == 0) {
                        System.out.println("6");
                    } else if (b % 4 == 1) {
                        System.out.println("8");
                    } else if (b % 4 == 2) {
                        System.out.println("4");
                    } else if (b % 4 == 3) {
                        System.out.println("2");
                    }
                    break;
                case 9 :
                    if (b % 2 == 0) {
                        System.out.println("1");
                    } else {
                        System.out.println("9");
                    }
                    break;
            }
        }
    }
}