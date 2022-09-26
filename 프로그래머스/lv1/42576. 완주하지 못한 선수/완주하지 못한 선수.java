import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        String s = "";
        for (int i = 0; i < participant.length; i++) {
            if (i == completion.length) {
                break;
            }
            
            if (!participant[i].equals(completion[i])) {
                s = participant[i];
                break;
            }
            s = participant[participant.length - 1];
        }
        return s;
    }
}