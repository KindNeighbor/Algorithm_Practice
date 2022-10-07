import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        if(A>=90){
            System.out.println("A");
        }
        if((A<90)&&(A>=80)){
            System.out.println("B");
        }
        if((A<80)&&(A>=70)){
            System.out.println("C");
        }
        if((A<70)&&(A>=60)){
            System.out.println("D");
        }
        if(A<60){
            System.out.println("F");
        }
    }
}