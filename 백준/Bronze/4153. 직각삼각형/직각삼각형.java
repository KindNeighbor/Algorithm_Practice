import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        while(true) {
            
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
            double X = Double.parseDouble(st.nextToken());          
            double Y = Double.parseDouble(st.nextToken());
            double Z = Double.parseDouble(st.nextToken());
            
            if((X == 0) && (Y == 0) && (Z == 0)) break;
            
            if((Math.pow(X,2) + Math.pow(Y,2)) == Math.pow(Z,2)) {
                System.out.println("right");
            } else if((Math.pow(Y,2) + Math.pow(Z,2)) == Math.pow(X,2)) {
                System.out.println("right");
            } else if((Math.pow(X,2) + Math.pow(Z,2)) == Math.pow(Y,2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }          
        }                
    }
}