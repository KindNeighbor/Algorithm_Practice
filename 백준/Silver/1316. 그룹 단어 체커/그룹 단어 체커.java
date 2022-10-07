import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {   
        
        int count = 0;
        int N = Integer.parseInt(br.readLine());
        
        for(int i=0; i<N; i++) {
            if(Func() == true) {
                count++;
            }
        }
        System.out.println(count);
    }
    
    public static boolean Func() throws IOException {
        boolean[] Func = new boolean[26];
        int a = 0;
        String S = br.readLine();
        
        for(int i=0; i<S.length(); i++) {
            int b = S.charAt(i);
            
            if(a != b) {
                if(Func[b - 'a'] == false) {
                   Func[b - 'a'] = true;
                   a = b;
                }
                
                else {
                    return false;
                }
            }
            
            else {
                continue;
            }
        }
        return true;
    }
}