package Algorism;

public class test_16 {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        boolean answer = true;

        s = s.toLowerCase();  //전부 소문자로 변경

        for (int i = 0; i < s.length(); i++) {   //p와 y의 개수 세기
            char c = s.charAt(i);

            if (c =='p')
                p++;
            else if (c == 'y')
                y++;
        }

        answer = p == y ? true : false;   //갯수가 같으면 TURe 아니면 FALSE

        return answer;
        }
         }
    }

//
//    1. toLowerCASE()를 사용해 입력받은 문자열을 소문자로 바꿔준다.
//    2.문자열을 1글자씩 체크해 P와 Y 각각의 개수를 구해준다.
//    3.p와 y의 개수가 같으면 TRUE  아니면 FALSE를 출력해준다.
//










//            문자열을 소문자로 변환해서 반환
//
//            문법(Syntax)
//            1
//            string.toLowerCase()
//            인자(Parameters)
//            없음
//
//            반환값(Return)
//            소문자로 변환된 문자열
//
//            설명(Description)
//            toUpperCase는 대문자로 변환
//
//            예제(Example)
//            1
//            2
//            var str = 'Coding EveryBody';
//            alert(str.toLowerCase()); // coding everybody
//



            package Algorism;

public class test_19 {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        boolean answer = true;

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c =='p')
                p++;
            else if (c == 'y')
                y++;
        }

        answer = p == y ? true : false;

        return answer;
    }
}



//toLowerCase()를 사용해 입력받은 문자열을 소문자로 바꿔준다.
//:문자열을 소문자로 변환해서 반환 / string.toLowerCase()
//        toUpperCase는 대문자로 변환
//        예제(Example)
//        1
//        2
//        var str = 'Coding EveryBody';
//        alert(str.toLowerCase()); // coding everybody



//문자열을 1 글자씩 체크해 p와 Y 각각의 개수를 구해준다.
// p와 y의 개수가 같으면 true 아니라면 false를 출력해준다.


