package Algorism;

public class test_13 {
    class Solution {
        public String solution(int a, int b) {

            String answer = "";

            String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
            String[] year = new String[366];
            int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
            int want_day = 0;

            //1월 1일이 금요일이기에 (i+5)를 하여 금요일을 시작으로 만들었다.
            for(int i=0; i<year.length; i++) {
                year[i] =  day[(i+5)%7];
            }

            for(int i=0; i<a-1; i++) {
                want_day += month[i];
            }

            //1월 1일도 하루 지난 것으로 되어서 -1을 해야한다!
            want_day += b-1;

            answer = year[want_day];

            return answer;
        }
    }

}


//각 월별 날짜를 배열로 만들고 1월 1일을 금요일이라 생각하고 나머지연산자를 이용하여 문제를 풀기로 하였다.
//
//원래 1월 1일이 월요일이라면 그냥 i%7을 하면 되지만 금요일이기 때문에 (i+5)%7 을 사용하였다.
//
//마지막에 want_day += b-1 에서 -1을 한 이유는 -1을 하지 않으면 1월 1일도 하루가 지난 것으로 치기 때문에 -1을 하였다.