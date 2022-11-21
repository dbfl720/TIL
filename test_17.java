package Algorism;

public class test_17 {
    // 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
    public boolean solution(String s) {
        boolean answer = true;


        // 길이가 4 또는 6이고,
        if ( s.length() == 4 || s.length() == 6 )
        {
            // 모두 숫자로 이루어졌니?
            for( int i=0; i<s.length(); i++){
                if ( s.charAt(i) < '0' || s.charAt(i) > '9' ){
                    return false;

                }
            }

        } else {
            return false;
        }
        return answer;
    }
}

//
//    문자열 받기
//
// "Hello World"를 charAt(0)을 통해서 첫 번째 문자열 "H"만 받아올 수 있습니다
//
//    밑의 System.out.print를 실행하면 "H"만 받아옵니다
//
//    String str = "Hello World";
//System.out.print(str.charAt(0));




//    논리 연산자(logical operator)는 연산식의 조합이 참이냐 거짓이냐의 판단이 필요한 경우 사용하는 연산자입니다.
//
//    논리 연산자는 세 가지 종류가 있습니다.
//
//            1 | 모두 참일 때만 참인 and 연산자: &&
//
//            2 | 하나라도 참이면 참인 or 연산자: ||
//
//            3 | 참은 거짓으로, 거짓은 참으로 not 연산자: !

