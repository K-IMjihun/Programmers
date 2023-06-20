package Programmers;


import java.util.Arrays;

// commends 첫번째값 ~ 두번째 값 까지 자른 후, 세번째 순서에 있는 값을 출력해라
public class Sparta_42748 {
    public static void main(String[] args) {
        int [] array = {1, 5, 2, 6, 3, 7, 4};
        int[][]commands	= {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}, {1,3,2}};
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++){
            int[] destArray = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(destArray);
            answer[i] = destArray[commands[i][2]-1];
        }
        System.out.println(Arrays.toString(answer));
//        return answer;
    }
}
