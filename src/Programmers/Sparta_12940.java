package Programmers;

import java.util.Arrays;

public class Sparta_12940 {
    //최대공약수와 최소공배수
    public static void main(String[] args) {
        int n = 3;
        int m = 12;
        int gcd = getGCD(n, m);
        int lcm = (n * m) / gcd;
        int [] answer = {gcd, lcm};
        System.out.println(Arrays.toString(answer));
        }
    public static int getGCD(int a, int b){
        while(b != 0){
            int r = a % b;

            a = b;
            b = r;
        }
        return a;
    }
}
