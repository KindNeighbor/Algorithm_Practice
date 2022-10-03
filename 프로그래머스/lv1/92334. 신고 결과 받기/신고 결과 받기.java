import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
      HashSet<String>[] reportSet = new HashSet[id_list.length];

        for (int i = 0; i < id_list.length; i++) {
            reportSet[i] = new HashSet<>();
        }
        
        // 1. 유저가 신고한 사람 목록
        for (int i = 0; i < report.length; i++) {
            String[] s1 = report[i].split(" ");
            for (int j = 0; j < id_list.length; j++) {
                if (s1[0].equals(id_list[j])) {
                    reportSet[j].add(s1[1]);
                }
            }
        }

        // 2. 신고당한 횟수 확인
        int[] arr1 = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            for (String s : reportSet[i]) {
                for (int j = 0; j < id_list.length; j++) {
                    if (id_list[j].equals(s)) {
                        arr1[j] += 1;
                    }
                }
            }
        }

        // 3. 신고한 사람 중 k번 이상 신고당한 사람이 몇 명인지 확인
        int[] arr2 = new int[id_list.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] >= k) {
                    if (reportSet[i].contains(id_list[j])) {
                        arr2[i] += 1;
                    }
                }
            }
        }

        return arr2;  
    }
}