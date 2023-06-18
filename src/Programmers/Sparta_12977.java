package Programmers;

public class Sparta_12977 {
    public static void main(String[] args) {
        int [] nums = {1,2,7,6,4};
        int answer = 0;
        for(int i = 0; i < nums.length-2; i++){
            int number;
            for(int j = i+1; j < nums.length-1; j++){
                for(int k = j+1; k < nums.length; k++){
                    //셋을 더한 값
                    number = nums[i] + nums[j] + nums[k];
                    //소수 확인 부분. 2부터 number 값 전까지 확인
                    for(int l = 2; l <= number-1; l++) {
                        //세 값이 같은 배열을 쓰고있지 않다면
                        if ((i != j) && (j != k) && (i != k)) {
                            //소수가 아니라면 break
                            if (number % l == 0) {
                                break;
                            }
                            //number 값 전까지
                            else if (l == number - 1) {
                                answer++;
                            }
                        }
                    }

                }
            }
        }
        System.out.println(answer); // 4;
//        return answer;
    }
}

