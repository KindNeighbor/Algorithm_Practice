import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            int a = Integer.parseInt(br.readLine());

            if(a == 0) {
                break;
            }

            if(isPalindrome(Integer.toString(a)) == 1) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    static int recursion(String s, int l, int r) {
        if (l >= r) {
            return 1;
        } else if (s.charAt(l) != s.charAt(r)) {
            return 0;
        } else {
            return recursion(s, l + 1, r - 1);
        }
    }

    static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }
}