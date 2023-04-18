class Solution {
    
    static int Xidx;
    static int Yidx;
    
    public int[] solution(String[] park, String[] routes) {
               
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                char c = park[i].charAt(j);
                if (c == 'S') {
                    Xidx = j;
                    Yidx = i;
                    break;
                }
            }
        }
        
        int a = 0;
        
        for (int i = 0; i < routes.length; i++) {
            switch(routes[i].substring(0, 1)) {
                case "E" :
                    a = Integer.parseInt(routes[i].substring(2));
                    moveEast(park, a);
                    break;
                case "S" :
                    a = Integer.parseInt(routes[i].substring(2));
                    moveSouth(park, a);
                    break;
                case "W" :
                    a = Integer.parseInt(routes[i].substring(2));
                    moveWest(park, a);
                    break;
                case "N" :
                    a = Integer.parseInt(routes[i].substring(2));
                    moveNorth(park, a);
                    break;
            }
        }
        
        int[] ans = new int[2];
        ans[0] = Yidx; ans[1] = Xidx;
        return ans;
    }
    
    public void moveEast(String[] park, int a) {
        if (Xidx + a > park[0].length() - 1) {
            return;
        }
        for (int j = 1; j <= a; j++) {
            if (park[Yidx].charAt(Xidx + j) == 'X') {
                 return;
            }
        }
        Xidx += a;
    }
    
    public void moveSouth(String[] park, int a) {
        if (Yidx + a > park.length - 1) {
            return;
        }
        for (int j = 1; j <= a; j++) {
            if (park[Yidx + j].charAt(Xidx) == 'X') {
                 return;
            }
        }
        Yidx += a;
    }
    
    public void moveWest(String[] park, int a) {
        if (Xidx - a < 0) {
            return;
        }
        for (int j = 1; j <= a; j++) {
            if (park[Yidx].charAt(Xidx - j) == 'X') {
                 return;
            }
        }
        Xidx -= a;
    }
    
    public void moveNorth(String[] park, int a) {
        if (Yidx - a < 0) {
            return;
        }
        for (int j = 1; j <= a; j++) {
            if (park[Yidx - j].charAt(Xidx) == 'X') {
                 return;
            }
        }
        Yidx -= a;
    }
}