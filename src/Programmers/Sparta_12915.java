package Programmers;

import java.util.*;

public class Sparta_12915 {
    public static void sparta_12915() {
        int n = 1;
        String [] strings = {"abce", "abcd","abcb", "cdx", "asd", "abc"};
        String [] answer;
        List<String> list = new ArrayList<>();
        for(int i = 0; i < strings.length; i++){
            list.add(strings[i].charAt(n)+strings[i]);
        }
        Collections.sort(list);
        answer = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }
        System.out.println(Arrays.toString(answer));
    }
}
