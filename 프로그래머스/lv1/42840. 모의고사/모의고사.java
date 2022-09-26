import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] score = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == person1[i%5]) {
                score[0]++;
            }
            if (answers[i] == person2[i%8]) {
                score[1]++;
            }
            if (answers[i] == person3[i%10]) {
                score[2]++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        
        if (score[0] > score[1] && score[0] > score[2]) {
            list.add(1);
        } else if (score[1] > score[0] && score[1] > score[2]) {
            list.add(2);
        } else if (score[2] > score[0] && score[2] > score[1]) {
            list.add(3);
        } else if (score[0] == score[1] && score[0] > score[2]) {
            list.add(1);
            list.add(2);
        } else if (score[1] == score[2] && score[1] > score[0]) {
            list.add(2);
            list.add(3);
        } else if (score[0] == score[2] && score[0] > score[1]) {
            list.add(1);
            list.add(3);
        } else {
            list.add(1);
            list.add(2);
            list.add(3);
        }
        
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}