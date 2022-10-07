import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] a = new int[N][2];
        
        StringTokenizer st;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            a[i][0] = Integer.parseInt(st.nextToken());
			a[i][1] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(a, new Comparator<int[]>() {		
	        @Override
	        public int compare(int[] b1, int[] b2) {
		        if(b1[0] == b2[0]) {		
			        return b1[1] - b2[1];
		        } else {
			        return b1[0] - b2[0];
		        }
    	    }
        });
        
        StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {           
			sb.append(a[i][0] + " " + a[i][1]).append('\n');
		}
		System.out.println(sb);
            
    }
}