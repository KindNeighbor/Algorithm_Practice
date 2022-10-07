import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        
        if(((B-45)>=0)&&(A>0)) {
            B = (B-45);
            System.out.println(A +" "+ B);
        }
        else if(((B-45)<0)&&(A>0)) {
            A = (A-1);
            B = (60+(B-45));
            System.out.println(A +" "+ B);
        }
        else if(((B-45)>=0)&&(A==0)) {
            B = (B-45);
            System.out.println(A +" "+ B);
        }
        else if(((B-45)<0)&&(A==0)) {
            A = 23;
            B = (60+(B-45));
            System.out.println(A +" "+ B);
        }
    }
}