package Practice;

public class Practice_68 {

    public static void main(String[] args) {

        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue ; // 컴파일 오류 발생.
        intValue = (int) doubleValue; // 형변환.

        System.out.println(intValue);

        System.out.println(doubleValue);

        // 형변환을 한다고 해서 doubleValue 자체의 타입이 변경되거나 그 안에 있는 값을 변경x


        System.out.println(10.5);

        System.out.println((int) 10.5);

    }
}



/*

int 형은 double형보다 숫자의 표현 범위가 작다. 그리고 실수를 표현할 수도 없다.
따라서 이 경우 숫자가 손실되는 문제가 발생할 수 있다.
쉽게 이야기해서 큰 컵에 담긴 물을 작은 컵에 옮겨 담으려고 하니, 손실이 발생할 수 있다는 것이다.
이런 문제는 매우 큰 버그를 유발할 수 있다. 예를 들어서, 은행 프로그램이 고객에게 은행 이자를
계산해서 입금해야 하는데 만약 이런 코드가 아무런 오류 없이 수행된다면 끔찍한 문제를 만들 수 있다.
그래서 자바는 이런 경우 컴파일 오류를 발생시킨다. 항상 강조하지만 컴파일 오류는
문제를 가장 빨리 발견할 수 있는 좋은 오류이다.

 */