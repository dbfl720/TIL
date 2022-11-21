package Algorism;

public class test_18 {
    String answer = "";



        for(int i = 0;i<seoul.length;i++)

    {
        if (seoul[i].equals("Kim")) {
            answer = "김서방은 " + i + "에 있다";
        }
    }

        return answer;
}
}
        }


//  <문제>
//        String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요. seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
//
//        제한사항
//
//        seoul은 길이 1 이상, 1000 이하인 배열입니다.
//        seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
//        "Kim"은 반드시 seoul 안에 포함되어 있습니다.


//        A.equals(B)
//
//        A와 B가 가지고 있는 값이 동일하면 true를 출력합니다.
//
//        String str1 = "Hello";
//        String str2 = "Hello";
//        String str3 = new String("Hello");
//
//        System.out.println(str1.equals(str2)); // true가 출력됨
//        System.out.println(str1.equals(str3)); // true가 출력됨