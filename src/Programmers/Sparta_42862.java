package Programmers;

import java.util.*;

// 체육복 빌리기
public class Sparta_42862 {
    public static void sparta_42862() {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int n  =5;
        int [] lost = {2, 4};
        int [] reserve = {1, 3, 5};
        int[] students = new int[n];
        int answer = 0;
        // 모든 학생은 체육복을 가지고 있다고 가정
        for (int i = 0; i < n; i++) {
            students[i] = 1;
        }

        // 체육복을 잃어버린 학생들
        for (int i = 0; i < lost.length; i++) {
            students[lost[i] - 1]--;
        }

        // 여벌의 체육복을 가져온 학생들
        for (int i = 0; i < reserve.length; i++) {
            students[reserve[i] - 1]++;
        }

        // 체육복을 빌려주기
        for (int i = 0; i < n; i++) {
            if (students[i] == 0) {
                
                //0번째 학생이 아닐 경우, 왼쪽에서 빌림
                if (i > 0 && students[i - 1] == 2) {
                    students[i - 1] = 1;
                    students[i] = 1;
                //마지막 학생이 아니고, 왼쪽에 체육복이 없을 경우, 오른쪽에서 빌림
                } else if (i < n - 1 && students[i + 1] == 2) {
                    students[i + 1] = 1;
                    students[i] = 1;
                }
            }
        }

        // 체육수업을 들을 수 있는 학생 수 계산
        for (int i = 0; i < n; i++) {
            if (students[i] > 0) {
                answer++;
            }
        }
        System.out.println(answer);
//        return count;
    }
}
