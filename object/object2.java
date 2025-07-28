package object;

class object2 {
    public static void main(String[] args) {
        Tv t1;
        t1= new Tv(); //  t1은 Tv에 접근하기 위한 참조변수.
        Tv t2;
        t2= new Tv();
        System.out.println("t1의 channel값은 "+ t1.channel + "입니다.");
        System.out.println("t2의 channel값은 "+ t2.channel + "입니다.");

        t1.channel= 7; // channel이라는 속성 값을 7로 바꿈.

        System.out.println("t1의 channel값은 " + t1.channel+ "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel+ "입니다.");




    }
}
