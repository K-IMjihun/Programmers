package LV_1;

import java.util.*;

public class LV1_42576 {
        public String lv1_42576(String[] participant, String[] completion) {

            String answer = "";
            Arrays.sort(participant);
            Arrays.sort(completion);

            for (int i = 0; i < completion.length; i++) {
                if (!participant[i].equals(completion[i])) {
                    answer = participant[i];
                    break;
                }
            }

            if (answer.isEmpty()) {
                answer = participant[participant.length - 1];
            }

            return answer;
        }
    }
