import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt(),
                     sc.nextInt(), sc.nextInt(), sc.nextInt(),
                     sc.nextInt(), sc.nextInt(), sc.nextInt(),};
        sc.close();
        int i = 0;
        int count = 0;
        int max = 0;
        for(int val : arr) {
            count++;
            if(val>max){
                max = val;
                i = count;
            }
        }
        System.out.println(max+"\n"+i);
    }
}