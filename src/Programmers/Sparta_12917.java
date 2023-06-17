package Programmers;

public class Sparta_12917 {
    public static void lv1_12917() {
    String s = "Zbcdefg";
    String answer = "";
    char[] c = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
        c[i] = s.charAt(i);
        System.out.print(c[i]);
    }
    int count = 0;
        for (int i = 0; i < c.length-1; i++) {
        for(int j = 0; j < c.length-count-1; j++) {
            if (c[j] < c[j + 1]) {
                char temp = c[j];
                c[j] = c[j + 1];
                c[j + 1] = temp;
            }
            else{
                System.out.println(j + "그런건없다");
            }
        }
        count++;
    }
        System.out.println();
        for(int i = 0; i < c.length; i++) {
        answer += c[i];
    }


    //Arrays.sort()로 구현
//             String[] so = new String[s.length()];
//     String answer = "";
//     for(int i = 0; i < so.length; i++){
//       so[i] = String.valueOf(s.charAt(i));
//     }
//     Arrays.sort(so, Collections.reverseOrder());
//     for(int i = 0; i < so.length; i++){
//       answer += so[i];
//     }
    }
}

