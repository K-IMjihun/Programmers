package Programmers;

public class Sparta_72410 {
    public static void sparta_72410() {
        String new_id = "asdzxcqweasdzx.fed.";

        String answer = new_id.toLowerCase();

        // ^ = not연산자
        // -_., a ~ z, 0 ~ 9의 값이 아니라면 공백("")으로 변환
        answer = answer.replaceAll("[^-_.a-z0-9]","");

        // 점이 2개 이상 이라면 하나만 출력
        answer = answer.replaceAll("[.]{2,}",".");

        // ^ = 문자열의 시작을 나타냄
        // | = or 연산자
        // $ = 문자열의 끝을 나타냄
        // 시작과 끝의 점을 공백("")으로 변환
        answer = answer.replaceAll("^[.]|[.]$","");

        // 공백이라면 a 추가
        if(answer.equals(""))
            answer+="a";

        // 16글자가 넘는다면 0 ~ 15까지 slicing
        // 자른 후, 마지막 글자가 .이라면 공백("")으로 변환
        if(answer.length() >=16){
            answer = answer.substring(0,15);
            answer=answer.replaceAll("[.]$","");
        }

        //길이가 세글자 이하라면, 세글자가 될 때 까지 마지막 문자열 ++;
        if(answer.length()<=2) {
            while (answer.length() < 3) {
                answer += answer.charAt(answer.length() - 1);

            }
        }
//        return answer;
        System.out.println(answer);


    }
}

