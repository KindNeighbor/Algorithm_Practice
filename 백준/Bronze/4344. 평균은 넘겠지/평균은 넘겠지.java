import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        
        int[] arr;
        
        for(int i=0;i<C;i++){    
            int N = sc.nextInt();
            arr = new int[N];
            double sum = 0;
            
            for(int j=0;j<N;j++){
                int a = sc.nextInt();
                arr[j] = a;
                sum += a;
            }
            double b = (sum/N);
            double count = 0;
            
            for(int j=0;j<N;j++) {
                if(arr[j]>b) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(count/N)*100);
        }
        sc.close();
    }
}