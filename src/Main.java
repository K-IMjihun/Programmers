import java.util.*;


//나중에 할 것
class Main {
    public static void main(String[] args) {
        String s = "23four5six7";
        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        String notNumS = "";
        String stringAnswer = "";
        int answer = 0;

        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                stringAnswer += s.charAt(i);
            }
            else{
                notNumS += s.charAt(i);
                if(map.containsKey(notNumS)){
                    stringAnswer += map.get(notNumS);
                    notNumS = "";
                }
            }
        }
        answer = Integer.parseInt(stringAnswer);

    }
}