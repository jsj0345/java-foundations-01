package Practice;

public class Practice_15 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println(a==b);  // 서로 같은가?
        System.out.println(a!=b);  // 서로 다른가?
        System.out.println(a>b);   //  a가 더 큰가?
        System.out.println(a<b);   // b가 더 큰가?
        System.out.println(a>=b);  // a가 b보다 크거나 같나?
        System.out.println(a<=b);  // a가 b보다 작거나 같나?

        // 결과를 boolean 변수에 담을 수 있다.
        boolean result = (a==b);
        System.out.println(result);

    }
}
