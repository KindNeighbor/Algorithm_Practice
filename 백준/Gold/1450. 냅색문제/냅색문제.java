import java.io.*;
import java.util.*;

public class Main {
	static int a;
	static int[] arr;
	static ArrayList<Integer> left, right;
	public static void main(String[] args) throws  IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		a = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		left = new ArrayList<>();
		right = new ArrayList<>();
		recur(left, 0, n/2, 0);
		recur(right, n/2, n, 0);
		Collections.sort(right);
		
		int cnt = 0;
		int idx = 0;
        
		for(int i=0; i<left.size(); i++) {
			idx = binarySearch(0, right.size()-1, left.get(i));
			cnt += idx + 1;
		}
        
		System.out.println(cnt);
	}
    
    public static int binarySearch(int l, int r, int v) {
        while (l <= r) {
            int mid = (l + r) / 2;
            if (right.get(mid) <= a - v) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return r;
    }
    
    public static void recur(ArrayList<Integer> list, int start, int end, int sum) {
        if (sum > a) {
            return;
        }
        
        if (start == end) {
            list.add(sum);
            return;
        }
        recur(list, start+1, end, sum);
        recur(list, start+1, end, sum + arr[start]);
    }
}