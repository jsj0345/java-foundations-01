package object;

class Data2 {
    int x;
}

class object6 {
    public static void main(String[] args) {
        Data2 d; // Data2 클래스 타입의 참조변수 d를 선언.
        d = new Data2(); // Data2 인스턴스를 생성한 후, 생성된 Data2 인스턴스의 주소를 d에 저장.

        d.x=10; // data인스턴스의 멤버변수 x의 값을 10으로 바꾼다.
        System.out.println("main() : x = " +d.x);

        change(d);
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(Data2 d){
        d.x = 1000;
        System.out.println("change() : x = " + d.x); // d.x의 값을 변경함.  main 메서드의 참조변수 d와 change메소드의 참조변수 d가 같은 객체를 가리키게 됨.
    }
}

