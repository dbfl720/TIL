package six_three;

public class Check {
    String name;
    String id;
    String password;
    int age;

    Check(String name, String id) {    //생성자에서 name 필드와 id필드를 외부에서 받은 값으로 초기화
        this.name = name;
        this.id = id;

    }
}
