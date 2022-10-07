import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); 
        for(int k=0; k<T; k++) {
        
            int R = sc.nextInt();
            String s = sc.next();
            
            for(int i=0; i<s.length(); i++) {
                for(int j=0; j<R; j++) {
                    System.out.print(s.charAt(i));
                }
            }
            System.out.println();
        }
    }
}