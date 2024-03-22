import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] sArr = s.split("-");
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < sArr.length; i++) {
            sb.append(sArr[i].charAt(0));
        }
        System.out.println(sb.toString());
    }
}