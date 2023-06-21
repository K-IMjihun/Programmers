package Programmers;
import java.util.*;
public class Sparta_12982 {
    public static void sparta_12982() {
                int[] d = { 2,4,5,6,7};
                int budget = 134;
                int answer = 0;
                Arrays.sort(d);
                for(int a : d){
                    if((budget - a) >= 0){
                        budget -= a;
                        answer++;
                    }
                    else{
                        break;
                    }
                }
        System.out.println(answer);
//                return answer;
            }
        }
