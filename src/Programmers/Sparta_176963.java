package Programmers;

import java.util.HashMap;
import java.util.Map;

public class Sparta_176963 {
    public int[] lv_176963(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {
                {"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}
        };
        int[] answer = new int[name.length];

        Map<String, Integer> a = new HashMap<String, Integer>();
        for (int i = 0; i < name.length; i++) {
            a.put(name[i], yearning[i]);
        }
//        for (String key : a.keySet()) {
//            System.out.println("Key: " + key + ", Value: " + a.get(key));
//        }
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                if (a.containsKey(photo[i][j])) {
                    answer[i] += a.get(photo[i][j]);
                }
            }
        }
        return answer;
    }
}
