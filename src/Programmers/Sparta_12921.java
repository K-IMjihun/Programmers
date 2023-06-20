package Programmers;

public class Sparta_12921 {
    public static void main(String[] args) {
        int n = 10;
        int answer = 0;

        //2, 3은 동작하지 않으므로, 2, 3보다 클 시 ++;
        answer += (n >= 2) ? 1 : 0;
        answer += (n >= 3) ? 1 : 0;
        for(int i = 4; i <= n; i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i%j == 0){
                    check = false;
                    break;
                }
            }
            answer += (check) ? 1 : 0 ;
        }
        System.out.println(answer);
    }
}
