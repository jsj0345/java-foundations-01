package object;

class Data {
    int x;
}

class object5 {
    public static void main(String[] args) {
        Data d; // Data 클래스 타입의 참조변수 d를 선언.
        d = new Data(); // Data 인스턴스를 생성한 후, 생성된 Data 인스턴스의 주소를 d에 저장.

        d.x=10; // data인스턴스의 멤버변수 x의 값을 10으로 바꾼다.
        System.out.println("main() : x = " +d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(int x){
        x = 1000;
        System.out.println("change() : x = " + x); // d.x의 값을 변경하는 것이 아니라 복사본이 변경된거임. 원본은 변경 x.
    }
}
