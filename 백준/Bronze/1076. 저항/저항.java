import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            String s = br.readLine();
            if (s.equals("black")) {
                sb.append("0");
            } else if (s.equals("brown")) {
                sb.append("1");
            } else if (s.equals("red")) {
                sb.append("2");
            } else if (s.equals("orange")) {
                sb.append("3");
            } else if (s.equals("yellow")) {
                sb.append("4");
            } else if (s.equals("green")) {
                sb.append("5");
            } else if (s.equals("blue")) {
                sb.append("6");
            } else if (s.equals("violet")) {
                sb.append("7");
            } else if (s.equals("grey")) {
                sb.append("8");
            } else if (s.equals("white")){
                sb.append("9");
            }
        }

        String suffColor = br.readLine();
        long ans = -1;
        if (sb.toString().charAt(0) == '0') {
            if (sb.toString().charAt(1) == '0') {
                ans = 0;
            } else {
                ans = Character.getNumericValue(sb.toString().charAt(1));
            }
        } else {
            ans = Long.parseLong(sb.toString());
        }

        if (suffColor.equals("black")) {
            ans *= 1;
        } else if (suffColor.equals("brown")) {
            ans *= 10;
        } else if (suffColor.equals("red")) {
            ans *= 100;
        } else if (suffColor.equals("orange")) {
            ans *= 1000;
        } else if (suffColor.equals("yellow")) {
            ans *= 10000;
        } else if (suffColor.equals("green")) {
            ans *= 100000;
        } else if (suffColor.equals("blue")) {
            ans *= 1000000;
        } else if (suffColor.equals("violet")) {
            ans *= 10000000;
        } else if (suffColor.equals("grey")) {
            ans *= 100000000;
        } else if (suffColor.equals("white")){
            ans *= 1000000000;
        }

        System.out.println(ans);
    }
}