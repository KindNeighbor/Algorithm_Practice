import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(function(sc.nextInt()));
        sc.close();
    }
    
    public static int function(int number) {
		int count = 0;
 
		if (number < 100) {
			return number;
		}
 
		else {
			count = 99;
 
			for (int i = 100; i <= number; i++) {
				int hun = i / 100; 
				int ten = (i / 10) % 10; 
				int one = i % 10;
 
				if ((hun - ten) == (ten - one)) { 
					count++;
				}
			}
		}
		return count;
	}
}