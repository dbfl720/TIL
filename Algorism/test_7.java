package Algorism;

public class test_7 {
    class Solution {
        public int solution(int[] absolutes, boolean[] signs) {
            int answer = 0;

            for (int i = 0; i < signs.length; i++) {
                if (signs[i]) {
                    answer += absolutes[i];
                } else {
                    answer -= absolutes[i];
                }
            }

            return answer;
        }
    }
}


//    signs의 해당 인덱스 값이
//
//true 일 경우 absolutes 값이 +양수
//
//        false일 경우 absolutes 값이 -음수로
//
//        총합을 더하면 된다
//
//
//
//        예를 들어 테스트 케이스 값인 [4,7,12] [true, false, true]이라면
//
//        +4, -7, +12가 됨으로 총합은 9가 된다
//for문과 if문을 이용하여 해결을 할 수 있다
