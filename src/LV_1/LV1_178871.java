package LV_1;

import java.util.*;


public class LV1_178871 {
    public String[] lv1_178871() {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};           // 5 ~ 50000
        String[] callings = {"kai", "kai", "mine", "mine"};                 // 2 ~ 1000000
        Map<String, Integer> map = new HashMap<>();

        //플레이어 이름과 초기등수 입력
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i + 1);
        }

        for (int i = 0; i < callings.length; i++) {
            // 추월한 선수 이름 저장
            String temp = "";
            temp = players[map.get(callings[i]) - 2];

            // 추월한 선수의 등수를 한 칸 앞으로 이동
            players[map.get(callings[i]) - 2] = players[map.get(callings[i]) - 1];

            // 추월당한 선수에 temp 값을 넣음.
            players[map.get(callings[i]) - 1] = temp;


            // 등수 조정
            map.put(callings[i], map.get(callings[i]) - 1);
            map.put(temp, map.get(temp) + 1);

        }
        return players;

    }
}
