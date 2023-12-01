import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        Stack<Character> st;
        for (int i = 0; i < N; i++) {
            st = new Stack<>();
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                if (st.isEmpty()) {
                    st.push(s.charAt(j));
                } else {
                    if (st.peek() == s.charAt(j)) {
                        st.pop();
                    } else {
                        st.push(s.charAt(j));
                    }
                }
            }
            if (st.size() == 0) {
                cnt++;
            } 
        }
        System.out.println(cnt);
    }
}