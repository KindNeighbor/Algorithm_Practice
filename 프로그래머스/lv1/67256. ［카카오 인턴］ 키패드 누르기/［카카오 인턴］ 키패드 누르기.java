import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        
        ArrayList<String> list = new ArrayList<>();
        int[][] arr = new int[12][2];
        arr[0][0] = 1; arr[0][1] = 0;
        arr[1][0] = 0; arr[1][1] = 3;
        arr[2][0] = 1; arr[2][1] = 3;
        arr[3][0] = 2; arr[3][1] = 3;
        arr[4][0] = 0; arr[4][1] = 2;
        arr[5][0] = 1; arr[5][1] = 2;
        arr[6][0] = 2; arr[6][1] = 2;
        arr[7][0] = 0; arr[7][1] = 1;
        arr[8][0] = 1; arr[8][1] = 1;
        arr[9][0] = 2; arr[9][1] = 1;
        arr[10][0] = 0; arr[10][1] = 0;
        arr[11][0] = 2; arr[11][1] = 0;
        
        int curLeft = 10;
        int curRight = 11;
        
        for (int i = 0; i < numbers.length; i++) {
            switch(numbers[i]) {
                case 1, 4, 7 :
                    list.add("L");
                    curLeft = numbers[i];
                    break;
                case 3, 6, 9 :
                    list.add("R");
                    curRight = numbers[i];
                    break;
                case 0, 2, 5, 8 :
                    int leftLength 
                        = Math.abs(arr[numbers[i]][0] - arr[curLeft][0]) 
                        + Math.abs(arr[numbers[i]][1] - arr[curLeft][1]);
                    int rightLength 
                        = Math.abs(arr[numbers[i]][0] - arr[curRight][0]) 
                        + Math.abs(arr[numbers[i]][1] - arr[curRight][1]);
                    if (leftLength < rightLength) {
                        list.add("L");
                        curLeft = numbers[i];
                    } else if (leftLength == rightLength) {
                        if (hand.equals("left")) {
                            list.add("L");
                            curLeft = numbers[i];
                        } else if (hand.equals("right")) {
                            list.add("R");
                            curRight = numbers[i];
                        }
                    } else {
                        list.add("R");
                        curRight = numbers[i];
                    }
                    break;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        
        return sb.toString();
    }
}