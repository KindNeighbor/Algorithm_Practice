import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String S = br.readLine();
        int count = 0;
        
        for(int i=0; i<S.length(); i++) {
            char ch = S.charAt(i);
            
            if(ch == 'c' && i < S.length() - 1) {
                if(S.charAt(i+1) == '=') {
                    i++;
                } else if (S.charAt(i+1) == '-') {
                    i++;
                }
            }
            else if(ch == 'd' && i < S.length() - 1) {
                if(S.charAt(i+1) == '-') {
                    i++;
                }
                else if(S.charAt(i+1) == 'z' && i < S.length() - 2) {
                    if(S.charAt(i+2) == '=') {
                        i +=2 ;
                    }
                 }
            }
            else if(ch == 'l' && i < S.length() - 1) {
                if(S.charAt(i+1) == 'j') {
                    i++;
                }
            }
            else if(ch == 'n' && i < S.length() - 1) {
                if(S.charAt(i+1) == 'j') {
                    i++;
                }
            }
            else if(ch == 's' && i < S.length() - 1) {
                if(S.charAt(i+1) == '=') {
                    i++;
                }
            }
            else if(ch == 'z' && i < S.length() - 1) {
                if(S.charAt(i+1) == '=') {
                    i++;
                }
            }
            count++;             
        }
        System.out.println(count);
    }
}