package Programmers;

public class Sparta_12977 {
    public static void main(String[] args) {
        String s = "a B z";
        int n = 4;
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 32){
                answer += ' ';

            }
            else if(s.charAt(i)+n > 122 ||(s.charAt(i) <= 90 && s.charAt(i)+n > 90)){
                answer += String.valueOf((char)(s.charAt(i)-26 + n));
            }
            else{
                answer += String.valueOf((char)(s.charAt(i)+n));
            }
        }

        System.out.println(answer);
    }
}
