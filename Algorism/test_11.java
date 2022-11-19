package Algorism;

public class test_11 {
    public long[] solution(int x, int n) {
    // n의 개수만큼 배열이 만들어지니까 n의 개수의 배열을 생성해준다.
    long[] answer = new long[n];
    // 제한조건에서 범위가 크므로 int가 아닌 long으로...
    // for 문을 돌려서 몇 개인지를 확인한 후에
        for(int i=0; i < answer.length; i++){
        // 곱해주면
        answer[i] = (long)x * (i+1);
    }
        return answer;
}
}

//// n개 갯수만큼 x의 배수가 나오면 되는 문제이다.
//        그래서 n개의 갯수를 for문으로 answer.legnth를 넣어 확인한 후에
//        이에 x(i+1)을 곱해주면 끝! i+1은 i가 숫자를 0부터 세기 때문에 더해주는 것.
//
//        profile
