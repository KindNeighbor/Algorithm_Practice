import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        char[][] arr = new char[N][M]; 
        
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                char c = s.charAt(j);
                arr[i][j] = c;
            }
        }
        
        int row = 0;
        for(int i = 0; i < N; i++) {
			boolean flag = true;
			for(int j = 0; j < M; j++) {
				if(arr[i][j] == 'X') {
					flag = false;
					break;
				}
			}
			if(flag) row ++;
		}
		
        int col = 0;
		for(int i = 0; i < M; i++) {
			boolean flag = true;
			for(int j = 0; j < N; j++) {
				  if(arr[j][i] == 'X') {
					  flag = false;
					  break;
				  }
			}
			if(flag) col ++;
		}
        
        System.out.println(Math.max(row, col));
    }
}
