import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int a = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
        
        String str = String.valueOf(a);
        
        for(int i=0;i<str.length();i++){
            arr[(str.charAt(i) - 48)]++;
        }
        for (int b : arr){
            System.out.println(b);
        }       
    }
}