package Practice; // Scope

public class Practice_62 {

    public static void main(String[] args) {
        int m = 10; // m 생존 시작. (m의 생존 범위 main 시작과 끝)
        if (true){
            int x = 20; // x 생존 시작. (if의 시작과 끝.)
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x 생존 종료.

        //System.out.println("main x = " + x);
        System.out.println("main m = " + m);

    } // m 생존 종료.

}



