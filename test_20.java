package Algorism;

public class test_20 {


    import java.util.*;
    class Solution {
        public String solution(String[] participant, String[] completion) {
            Arrays.sort(participant);
            Arrays.sort(completion);
            int i;
            for ( i=0; i<completion.length; i++){
                if (!participant[i].equals(completion[i])){    //completion과 participant가 다르면
                    return participant[i];
                }
            }
            return participant[i];
        }
    }

}`
//        Arrays.sort(participant);오름차순으로 정렬해라
ㅊ//
//    다음 풀이는 Sort를 이용한 풀이입니다. Participant 배열과 Completion 배열을 순서대로 정렬하여  놓고,
//        일치하지 않는 선수의 인덱스를 리턴하면 참가하지 않는 선수의 명단을 구할 수 있습니다.