import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int [] arr = new int[26];
        String S = sc.next();

        for(int i=0; i<S.length(); i++) {
            if(65 <= S.charAt(i) && S.charAt(i) <= 90) {
                arr[S.charAt(i) - 65]++;
            }
            else {
                arr[S.charAt(i) - 97]++;
            }
        }
        
        int max = -1;
        char ch = '?';
        
        for(int i=0; i<26; i++) {
            if(arr[i] > max) {
                max = arr[i];
                ch = (char)(i+65);
            }
            else if(arr[i] == max) {
                ch = '?';
            }
        }
        
        System.out.println(ch);
    }
}