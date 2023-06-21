package Programmers;

import java.util.ArrayList;
import java.util.List;

public class Sparta_68935 {
    public static void sparta_68935() {
        int n = 45;
        int answer = 0;
        List<String> list = new ArrayList<>();

        while(n != 0){
            list.add(String.valueOf(n%3));
            n = n/3;
        }
        int number = 1;
        for(int i = list.size()-1; i >= 0; i--){
            answer += Integer.parseInt(list.get(i))* number;
            number *=3;

        }
        System.out.println(answer);
    }
}
