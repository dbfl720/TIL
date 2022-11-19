package Algorism;

public class test_8 (int[] arr) {
    class Solution {
        public double solution(int[] arr) {

            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }

            double answer = (double) sum / arr.length;
            return answer;
        }
    }
}

//배열의 값을 더할 변수를 선언해준다.
//반복문을 이용해 배열의 값 하나씩 sum변수에 더해준다.
// sum / 배열의 길이를 나누어 평균값을 내준다. 여기서 ANSWER 타입이 Double형이기 때문에 double로 변환해준다.
//-> 여기서 원소가 -10000 이상 10000이하인 정수라서 DOUBLE로 했나..?