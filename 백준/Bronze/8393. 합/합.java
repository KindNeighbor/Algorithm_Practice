import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int answer = 0;
        for(int i=1; i<(A+1); i++){
            answer += i;
        }
        System.out.println(answer);
        in.close();
    }
}