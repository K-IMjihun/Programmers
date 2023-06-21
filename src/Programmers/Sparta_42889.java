package Programmers;


import java.util.*;

public class Sparta_42889 {
    public static void sparta_42889() {
        int N = 2;
        int[] stages = {1, 1, 1, 1};

        Map<Integer, Double> map = new HashMap<>();

        int answer[] = new int[N];
        // 1부터 N까지 map 생성
        for (int i = 0; i < N; i++) {
            map.put(i + 1, 0.0);
        }

        // stages의 값들을 넣음
        for (int i = 0; i < stages.length; i++) {
            //키값 존재 시 +1
            if (map.containsKey(stages[i])) {
                double count = map.get(stages[i]) + 1;
                map.put(stages[i], count);
            }
        }


        for (Map.Entry<Integer, Double> entry : map.entrySet()) {
            int number = stages.length;
            Integer key = entry.getKey();
            Double value = entry.getValue();
            for (int i = 0; i < stages.length; i++) {
                if (key > stages[i]) {
                    number--;
                }
            }
            if(value != 0){
                map.put(key, value / number);
            }
        }

        // Map.Entry를 리스트로 변환하여 정렬
        List<Map.Entry<Integer, Double>> entryList = new ArrayList<>(map.entrySet());


        // 밸류값으로 내림차순 정렬
        // entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // 밸류값으로 내림차순 정렬 후, 밸류값이 같을 시, 키값으로 오름차순 정렬
        entryList.sort(Map.Entry.<Integer, Double>comparingByValue()
                .reversed()
                .thenComparing(Map.Entry.comparingByKey()));



        for (int i = 0; i < answer.length; i++) {
            answer[i] = entryList.get(i).getKey();
        }

        System.out.println(Arrays.toString(answer));
//        return answer;
    }

}

