package Algorism;

public class test_19 {
    public String solution(int n) {
        String answer = "";


        for(int i = 1; i<=n;i++) {
            if (i % 2 !=0) answer += "수";
            else answer += "박";
        }
        return answer;
    }
}

//    for문과 삼항연산자를 사용했습니다.
//
//        입력받은 숫자를 2로 나눠서 나머지가 0이면 짝수이기 때문에 "수"를 answer에 입력하고
//
//        나머지가 0이 아니면 홀수이기 때문에 "박"을 입력합니다.




class Solution {
    public String solution(int n) {
        String answer = "";

        for(int i=1; i<=n; i++) {
            answer += i%2!=0 ? "수" : "박";
        }

        return answer;
    }
}

//
//    for문과 삼항연산자를 사용했습니다.
//
//        입력받은 숫자를 2로 나눠서 나머지가 0이면 짝수이기 때문에 "수"를 answer에 입력하고
//
//        나머지가 0이 아니면 홀수이기 때문에 "박"을 입력합니다.

