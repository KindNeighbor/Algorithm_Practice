import java.io.*;
import java.util.*;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Deque<int[]> dq = new ArrayDeque<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("1 ");
		int a = arr[0];
		
		for(int i = 1; i < N; i++){
			dq.add(new int[] {(i + 1), arr[i]});
		}
		
		while(!dq.isEmpty()) {
			if(a > 0) {
                
				for(int i = 1; i < a; i++) {
					dq.add(dq.poll());
				}
				
				int[] arr2 = dq.poll();
				a = arr2[1];
				sb.append(arr2[0] + " ");
			} else {
                
				for(int i = 1; i < -a; i++) {
					dq.addFirst(dq.pollLast());
				}
				
				int[] arr2 = dq.pollLast();
				a = arr2[1];
				sb.append(arr2[0] + " ");
			}
		}				
		System.out.println(sb.toString());
		
	}
}