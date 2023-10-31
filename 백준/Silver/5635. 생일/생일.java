import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        HashMap<String, Birth> map = new HashMap<>();
        
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            Birth birth = new Birth(day, month, year);
            map.put(name, birth);
        }
        
        ArrayList<Map.Entry<String, Birth>> list = new ArrayList<>(map.entrySet());  
        Collections.sort(list, new Comparator<Map.Entry<String, Birth>>() {
                @Override
                public int compare(Map.Entry<String, Birth> entry1, 
                                   Map.Entry<String, Birth> entry2) {
                    Birth birth1 = entry1.getValue();
                    Birth birth2 = entry2.getValue();
                    
                    if (birth1.year != birth2.year) {
                        return birth1.year - birth2.year;
                    }
                    if (birth1.month != birth2.month) {
                        return birth1.month - birth2.month;
                    }
                    return birth1.day - birth2.day;
                }
            });
        
        ArrayList<String> list2 = new ArrayList<>();
        for (Map.Entry<String, Birth> entry : list) {
            String name = entry.getKey();
            list2.add(name);
        }
        
        System.out.println(list2.get(list2.size()-1));
        System.out.println(list2.get(0));
    }
    
    public static class Birth {
        int day;
        int month;
        int year;
        
        public Birth(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }
}