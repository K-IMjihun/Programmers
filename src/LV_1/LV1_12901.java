package LV_1;

public class LV1_12901 {
        public String lv1_12901(int a, int b) {
            String answer = "";
            String [] arr = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
            int [] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int days = +5;  //1월 1일 금요일로 설정
            for(int i = 0; i < a - 1; i++){
                days += months[i];
            }
            days += b - 1;
            answer = arr[(days)%7];
            return answer;
    }
}
