package Algorism;

public class test_9 {
    public String solution(String phone_number) {
        String answer = "";

        for(int i =0; i< phone_number.length(); i++){
            if(i < phone_number.length()-4)
                answer +="*";
            else
                answer += phone_number.charAt(i);
        }
        return answer;
    }
}


//for문을 이용해 PHONE_NUmber의 길이만큼 반복한다.
//if문을 이용하여 I가 phone_number의 길이에서 -4를 뺀 수보다 작을때까지   ????
// answer변수에 *을 넣어준다.
// 위조건이 아니라면, .charAt()메소드를 통해 문자를 하나씩 순서대로 넣어준다.
//charAt이란 String 타입의 데이터(문자열)에서 특정 문자를 char 타입으로 변환할 때 사용하는 함수이다.