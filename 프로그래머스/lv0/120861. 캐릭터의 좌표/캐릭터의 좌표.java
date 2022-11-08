class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < keyinput.length; i++) {
                switch(keyinput[i]) {
                    case "left" :
                        if (x - 1 < (-1) * (board[0] - 1) / 2) {
                            break;
                        } else {
                            x -= 1;
                            break;
                        }
                    case "right" :
                        if (x + 1 > (board[0] - 1) / 2) {
                            break;
                        } else {
                            x += 1;
                            break;
                        }
                    case "up" :
                        if (y + 1 > (board[1] - 1) / 2) {
                            break;
                        } else {
                            y += 1;
                            break;
                        }
                    case "down" :
                        if (y - 1 < (-1) * (board[1] - 1) / 2) {
                            break;
                        } else {
                            y -= 1;
                            break;
                        }
                }
            }
        
        int[] arr = new int[2];
        arr[0] = x; arr[1] = y;
        return arr;
    }
}