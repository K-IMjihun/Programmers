package Programmers;

import java.util.Arrays;
public class Sparta_17681 {
    public static void sparta_17681() {
        int n = 6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};
        String[][] binarys = new String[2][n];
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            binarys[0][i] = convertToBinaryString(arr1[i], n);
            binarys[1][i] = convertToBinaryString(arr2[i], n);
        }
        for(int i = 0; i < n; i++) {
            String map = "";
            for(int j = 0; j < n; j++) {
                map += ((binarys[0][i].charAt(j) == '1') || (binarys[1][i].charAt(j) == '1')) ? '#' : ' ';
            }

            answer[i] = map;
        }
        System.out.println(Arrays.deepToString(binarys));
        System.out.println(Arrays.deepToString(answer));
    }

    private static String convertToBinaryString(int number, int size) {
        //StringBuilder의 Integer.toBinaryString(number)로 이진수로 변환
        StringBuilder binary = new StringBuilder(Integer.toBinaryString(number));
        while (binary.length() < size) {
            // 0번째 문자열에 0 추가
            binary.insert(0, '0');
        }
        return binary.toString();
    }
}

