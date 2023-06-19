class Main {
    public static void main(String[] args) {
        String new_id = "123456789abcdefg";
        String answer = "";


        String lower = new_id.toLowerCase();

            String specialCheck = specialCheck(lower);
            String decimalCheck = decimalCheck(specialCheck);
            String decimalDelete = decimalDelete(decimalCheck);
            answer = lengthCheck(decimalDelete);
            while(answer.charAt(0) == '.' || answer.charAt(answer.length()-1) =='.') {
                answer = decimalDelete(answer);
            }
            System.out.println(answer);

    }


    // 2. 소문자, 숫자, 빼기, 언더바, 마침표를 제외한 모든 문자열 제거
    // 45 = 빼기, 46 = 점, 95 = 언더바,
    public static String specialCheck(String id){
        String specialCheck = "";
        for(int i = 0; i < id.length(); i++){
            char ch = id.charAt(i);
            if(((int)ch >= 97 && (int)ch <= 122) ||
                    ((int)ch >= 48 && (int)ch <= 57)||
                    (ch =='-' || ch == '_' || ch == '.')){
                specialCheck += ch;
            }
        }

        return specialCheck;
    }


    // 점 한개로 바꾸기
    public static String decimalCheck(String id){
        String decimalCheck = "";
        decimalCheck += id.charAt(0);
        for(int i = 1; i < id.length(); i++){
            char ch1 = id.charAt(i-1);
            char ch2 = id.charAt(i);
            if(ch1 == '.' && ch2 == '.'){
                continue;
            }
            else if((ch1 == '.' && ch2 != '.')){
                decimalCheck += ch2;
            }
            else{
                decimalCheck += ch2;
            }
        }
        return decimalCheck;
    }

    // 4. 첫번째 문자열과 마지막 문자열이 .일 시 제거
    public static String decimalDelete(String id){
        String decimalCheck = id;
        if(id.length() != 0) {
            if (id.charAt(0) == '.') {
                decimalCheck = id.substring(1, id.length());

            }
            if (id.charAt(id.length() - 1) == '.') {
                decimalCheck = id.substring(0, id.length() - 1);

            }
        }

        return decimalCheck;
    }

    public static String lengthCheck(String id){
        String lengthCheck = id;
        // 5. 빈 문자열일 시, new_id에 a 대입
        if(lengthCheck.length() == 0) {
            lengthCheck = "aaa";
        }
        // 6. 길이가 16자 이상 시, 0 ~ 15까지만 출력
        // 경계값 분석 필요
        else if(lengthCheck.length() > 15){
            lengthCheck = id.substring(0, 15);
        }
        // 7.길이가 2글자 이하 시, 마지막 문자를 3글자가 될 때 까지 붙임
        else if(lengthCheck.length()-1 < 2) {
            while (lengthCheck.length() != 3) {
                lengthCheck += id.charAt(id.length() - 1);
            }
        }
        return lengthCheck;
    }
}