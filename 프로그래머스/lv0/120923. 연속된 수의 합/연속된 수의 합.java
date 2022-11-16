class Solution {
    public int[] solution(int num, int total) {
        
        int length = num;
        int[] arr = new int[length];

        while (true) {
            int sum = 0;
            int a = num;
            
            for (int i = 0; i < length; i++) {
                    sum += a;
                    a++;
            }
            
            if (sum == total) {
                break;
            } else if (sum > total){
                num--;
            } else {
                num++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = num;
            num++;
        }

        return arr;
    }
}