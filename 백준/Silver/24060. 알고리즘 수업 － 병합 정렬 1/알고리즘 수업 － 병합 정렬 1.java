import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int count=0;
    static int K;
    static int result=-1;
    static int[] tmp;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String[] num=br.readLine().split(" ");

        int[] A=new int[Integer.parseInt(num[0])];
        K=Integer.parseInt(num[1]);
        tmp = new int[A.length];

        String[] nums=br.readLine().split(" ");

        for (int i=0;i<A.length;i++){
            A[i]=Integer.parseInt(nums[i]);
        }
        merge_sort(A,0,A.length-1);
        System.out.println(result);

    }

    public static void merge_sort(int[] A,int p,int r){


        if(p<r){
            int q=Math.abs((p+r)/2);

            merge_sort(A,p,q);

            merge_sort(A,q+1,r);
            merge(A,p,q,r);
        }

    }

    public static void merge(int[] A,int start,int mid,int end){
        int i=start ,j=mid+1, t=0;
        while (i<=mid && j<=end) {
            if(A[i] <= A[j]){
                tmp[t++]=A[i++];
            } else {
                tmp[t++]=A[j++];
            }
        }
        while (i <= mid) {
            tmp[t++] = A[i++];
        }

        while (j <= end) {
            tmp[t++]=A[j++];
        }

        i = start; t = 0;
        while (i <= end) { 
            count++;
            if(count == K){
                result = tmp[t];
                break;
            }
            A[i++]=tmp[t++];
        }
    }
}