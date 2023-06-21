package Programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 가장 많은 포켓몬 선택하기
public class Sparta_1845 {
    public static void sparta_1845() {
        int [] nums = {3,1,2,3};
        Set<Integer> set = new HashSet<Integer>();
        int answer = 0;
        for(int i : nums){
            set.add(i);
        }

        // 1. set.size가 nums.length를 넘으면 nums.length 출력
        // 2. set.size가 nums.length보다 같다면 아무거나 출력
        // 3. set.size가 nums.length보다 작다면 set.size 출력

        answer = (set.size() > nums.length/2)? nums.length/2 : set.size();
        System.out.println(answer);

    }
}
