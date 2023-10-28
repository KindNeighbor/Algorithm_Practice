import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        
        for (int i = 0; i < 10; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }
        
        for (int i = 0; i < 10; i++) {
            arr2[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int sum1 = arr1[arr1.length - 1] + arr1[arr1.length - 2] + arr1[arr1.length - 3];
        int sum2 = arr2[arr2.length - 1] + arr2[arr2.length - 2] + arr2[arr2.length - 3];
        
        System.out.println(sum1 + " " + sum2);
    }
}