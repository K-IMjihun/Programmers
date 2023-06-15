package LV_1;

class LV1_172928 {
    public int[] lv_172928(String[] park, String[] routes) {
        int[] answer = new int[2];

            Label:
            for (int i = 0; i < park.length; i++) {
                for (int j = 0; j < park[i].length(); j++) {
                    if (park[i].charAt(j) == 'S') {
                        answer[0] = i;      // 상하
                        answer[1] = j;      // 좌우
                        break Label;
                    }
                }
            }

//        System.out.println("S위치: " + Arrays.toString(answer));

            for (int i = 0; i < routes.length; i++) {
                char direction = routes[i].charAt(0);       // 방향
                int distance = routes[i].charAt(2) - '0';   // 이동 거리
                boolean oxCheck = false;

                if (direction == 'E') {
                    if (answer[1] + distance > park[answer[0]].length() - 1) {
                        continue;
                    } else {
                        for (int j = answer[1] + 1; j <= answer[1] + distance; j++) {
                            char ox = park[answer[0]].charAt(j);
                            if (ox == 'X') {
                                oxCheck = true;
                                break;
                            }
                        }
                    }
                    if (!oxCheck) {
                        answer[1] += distance;
                    }
                } else if (direction == 'W') {
                    if (answer[1] - distance < 0) {
                        continue;
                    } else {
                        for (int j = answer[1] - 1; j >= answer[1] - distance; j--) {
                            char ox = park[answer[0]].charAt(j);
                            if (ox == 'X') {
                                oxCheck = true;
                                break;
                            }
                        }
                    }
                    if (!oxCheck) {
                        answer[1] -= distance;
                    }
                } else if (direction == 'S') {
                    if (answer[0] + distance > park.length - 1) {
                        continue;
                    } else {
                        for (int j = answer[0] + 1; j <= answer[0] + distance; j++) {
                            char ox = park[j].charAt(answer[1]);
                            if (ox == 'X') {
                                oxCheck = true;
                                break;
                            }
                        }
                    }
                    if (!oxCheck) {
                        answer[0] += distance;
                    }
                } else if (direction == 'N') {
                    if (answer[0] - distance < 0) {
                        continue;
                    } else {
                        for (int j = answer[0] - 1; j >= answer[0] - distance; j--) {
                            char ox = park[j].charAt(answer[1]);
                            if (ox == 'X') {
                                oxCheck = true;
                                break;
                            }
                        }
                    }
                    if (!oxCheck) {
                        answer[0] -= distance;
                    }
                }
            }
            return answer;
        }
    }
