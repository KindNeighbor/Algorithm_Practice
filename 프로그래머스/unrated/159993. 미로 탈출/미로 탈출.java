import java.util.*;

class Solution {
    
    static int[][] map;
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};
    static boolean[][] check;
    
    public int solution(String[] maps) {
        
        int sx = 0; int sy = 0;
        int ex = 0; int ey = 0;
        int lx = 0; int ly = 0;
        
        map = new int[maps.length][maps[0].length()];
        check = new boolean[maps.length][maps[0].length()];
        
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[0].length(); j++) {
                if (maps[i].charAt(j) == 'O') {
                    map[i][j] = 1;
                } else if (maps[i].charAt(j) == 'S') {
                    map[i][j] = 1;
                    sx = i; sy = j;
                } else if (maps[i].charAt(j) == 'E') {
                    map[i][j] = 1;
                    ex = i; ey = j;
                } else if (maps[i].charAt(j) == 'L') {
                    map[i][j] = 1;
                    lx = i; ly = j;
                } else {
                    map[i][j] = 0;
                }
            }
        }
        
        int a = bfs(sx, sy, lx, ly);       
        if (a == -1) return -1;

        check = new boolean[maps.length][maps[0].length()];

        int b = bfs(lx, ly, ex, ey);
        if (b == -1) return -1;
        
        return a + b;
        
    }
    
    public int bfs(int startx, int starty, int endx, int endy) {
        int time = 0;
        Queue<Point> q = new LinkedList<>();
        check[startx][starty] = true;
        q.offer(new Point(startx, starty, 0));
        
        while (!q.isEmpty()) {
            Point current = q.poll();

            if (current.x == endx && current.y == endy) {
                return current.time;
            }
            
            for (int i = 0; i < 4; i++) {
            int nx = dx[i] + current.x;
            int ny = dy[i] + current.y;
            
                if (0 <= nx && 0 <= ny && nx < map.length && ny < map[0].length) {
                    if (check[nx][ny] == false && map[nx][ny] == 1) {
                        check[nx][ny] = true;
                        q.offer(new Point(nx, ny, current.time + 1));
                    }
                }
            }
        }
        
        return -1;
    }
    
    class Point {
        int x, y, time;
        
        public Point(int x, int y, int time) {
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }
}