import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();

		BigInteger A_bi = new BigInteger(A, 2);
		BigInteger B_bi = new BigInteger(B, 2);
	
		BigInteger sum = A_bi.add(B_bi);

		String sum_bi = sum.toString(2);
		
		System.out.println(sum_bi);
	}

}