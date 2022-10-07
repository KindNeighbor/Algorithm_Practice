import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        
        if((A==B)&&(B==C)){
            int a = 10000+1000*A;
            System.out.println(a);
        }
        else if((A==B)&&(B!=C)){
            int b = 1000+100*A;
            System.out.println(b);
        }
        else if((B==C)&&(C!=A)){
            int c = 1000+100*B;
            System.out.println(c);
        }
        else if((C==A)&&(A!=B)){
            int d = 1000+100*C;
            System.out.println(d);
        }
        else if((A!=B)&&(B!=C)&&(C!=A)){
            if((A>B)&&(A>C)){
                int e = 100*A;
                System.out.println(e);
            }
            else if((B>A)&&(B>C)){
                int f = 100*B;
                System.out.println(f);
            }
            else if((C>B)&&(C>A)){
                int g = 100*C;
                System.out.println(g);
            }
        }
    }
}