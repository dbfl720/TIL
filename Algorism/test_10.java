package Algorism;

public class test_10 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = new int[arr1.length][arr1[0].length];
        for(int i =0; i<arr1.length; i++ ){
            for(int j =0; j<arr1[i].length; j++){
                answer[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return answer;
    }
}

//}
//        기본 전제조건 자체가 arr1과 arr2의 행과 열의 크기가 같다고 하였다.
//        그래서 하나의 행의 길이(arr1.length)와 열의 길이(arr1[0].length)를 구해서 answer 변수에 메모리를 할당하였다.
//        여기서 arr1[0].length를 하는 이유는 1부터는 값이 있을수도있고 없을 수도 있기 때문이다.)
//        그리고나서 익숙하게 2중포문을 돌려 각각의 요소에 한번씩 arr1의 값과 arr2의 값을 더해주면 된다.