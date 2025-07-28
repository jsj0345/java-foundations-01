package Practice;

public class Practice_60 {
    public static void main(String[] args) {
        String url = "www.codechobo.com";
        float f1 = .10f;
        float f2 = 1e1f;
        float f3 = 3.14e3f;
        double d = 1.23456789;
        System.out.printf("f1=%f, %e , %g%n",f1,f1,f1);
        System.out.printf("f2=%f, %e , %g%n",f2,f2,f2);
        System.out.printf("f3=%f, %e , %g%n",f3,f3,f3);
        System.out.printf("d=%f%n",d);
        System.out.printf("d=%14.10f%n",d); // 14자리를 만듬. 먼저 소수점아래에서 10자리르 만들고 소수점과 소수점 앞에있는 숫자를 뺀 나머지는 공백으로 채움.
        System.out.printf("[12345678901234567890]%n");
        System.out.printf("[%s]%n",url);
        System.out.printf("[%20s]%n",url);
        System.out.printf("[%-20s]%n",url);
        System.out.printf("[%.8s]%n",url);



    }
}
