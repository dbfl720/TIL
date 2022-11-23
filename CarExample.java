package six_two;

public class CarExample {
    public static void main(String[] args) {

        Car myCar = new Car();  //객체 생성



        System.out.println("제작회사: " + myCar.company);   //필드값 읽기
        System.out.println("모델명: " + myCar.model);
        System.out.println("색깔: " + myCar.color);
        System.out.println("최고속도: "+ myCar.maxSpeed);
        System.out.println("현재속도: " + myCar.speed);


        myCar.speed = 60;           //필드값 변경
        System.out.println("수정된 속도: " + myCar.speed);

    }
}

