package operator;

public class Comp2{

    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello"); //리터럴 비교.
        boolean result2 = str1.equals("문자열1"); // 문자열 변수, 리터럴 비교.
        boolean result3 = str1.equals(str2); // 문자열 변수 비교.

        System.out.println(result1); // ctrl+shift+enter는 문장을 완성시켜줌.
        System.out.println(result2);
        System.out.println(result3);

        /*
        문자열 비교는 equals 메서드를 쓴다. ==을 쓰면 에러 발생 할 때가 있음.
         */

    }

}

