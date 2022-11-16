class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String password = id_pw[1];

        String[] id_list = new String[db.length];
        String[] password_list = new String[db.length];

        for (int i = 0; i < db.length; i++) {
            id_list[i] = db[i][0];
            password_list[i] = db[i][1];
        }

        for (int i = 0; i < db.length; i++) {
            if (id_list[i].equals(id)) {
                if (password_list[i].equals(password)) {
                    return "login";
                } else {
                    return "wrong pw";
                }
            }
        }

        return "fail";
    }
}