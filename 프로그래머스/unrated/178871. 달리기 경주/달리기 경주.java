import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
         
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for(int i = 0; i < callings.length; i++) {
            int a = map.get(callings[i]);
            map.put(callings[i], a - 1);
            map.put(players[a - 1], a);
            players[a] = players[a - 1];
            players[a - 1] = callings[i];

        }
        
        return players;
    }
}