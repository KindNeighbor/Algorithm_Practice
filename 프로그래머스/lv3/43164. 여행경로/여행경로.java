import java.util.*;

class Solution {
    
    static PriorityQueue<String> pq;
    static boolean[] visited;
    
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        pq = new PriorityQueue<>();
        dfs(tickets, 0, "ICN", "ICN");
        String[] sArr = pq.peek().split(",");
        return sArr;
    }
    
    public void dfs(String[][] tickets, int cnt, String curCity, String path) {
        if (cnt == tickets.length) {
            pq.add(path);
        }
        
        for (int i = 0; i < tickets.length; i++) {
            if (!visited[i] && curCity.equals(tickets[i][0])) {
                visited[i] = true;
                dfs(tickets, cnt+1, tickets[i][1], path+","+tickets[i][1]);
                visited[i] = false;
            }
        }
    }
}