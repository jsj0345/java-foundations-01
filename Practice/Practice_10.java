package Practice;

public class Practice_10 {

    public static void main(String[] args) {
        //정수
        byte b = 127; //-128 ~ 127
        short s = 32767; //-32768~32767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647

        //-9,223,372,036,854,775,808~9,223,372,036,854,775,807
        long l = 9223372036854775807L;  // long은 뒤에 L을 적어야함.

        //실수
        float f= 10.0f;  // float는 f를 붙여야함.
        double d=10.0;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);

        /*
        실무에서는 int , long, double, boolean, String을 많이 쑴.
         */



    }
}
