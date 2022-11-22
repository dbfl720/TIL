package Algorism;

public class test_24 {
    public long solution2(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list,Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(String s:list) {
            sb.append(s);
        }
        return Long.parseLong(sb.toString());
    }
    String array를 사용하면 Collections.reverseOrder()를 사용해서 정렬 할 수 있다.
}

//
//
//    함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
//        예를들어 n이 118372면 873211을 리턴하면 됩니다.
//
//        제한 조건
//        n은 1이상 8000000000 이하인 자연수입니다.
//        입출력 예
//        n	return
//        118372	873211
}
