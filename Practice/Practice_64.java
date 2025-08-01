package Practice;

public class Practice_64 {

    public static void main(String[] args) {

        int m = 10;
        int temp = 0;

        if(m > 0){
            temp = m * 2;
            System.out.println("temp = " + temp);
        }

        System.out.println("m = " + m);
        System.out.println("temp = " + temp);

    }
}


/*
비효율적인 메모리 사용 : temp는 if 코드 블록에서만 필요하지만, main() 코드 블록이 종료될 때 까지 메모리에 유지된다.
따라서 불필요한 메모리가 낭비된다. 만약 if 코드 블록 안에 temp를 선언했다면 자바를 구현하는 곳에서 if 코드 블록의
종료 시점에 이 변수를 메모리에서 제거해서 더 효율적으로 메모리를 사용할 수 있다.
 */

/*
코드 복잡성 증가 : 좋은 코드는 군더더기 없는 단순한 코드이다. temp는 if 코드 블록에서만 필요하고, 여기서만 사용된다.
만약 if 코드 블록 안에 temp를 선언했다면 if가 끝나고 나면 temp를 전혀 생각하지 않아도 된다. 머릿속에서 변수를
하나 줄일 수 있다. 그런데 지금 작성한 코드는 if 코드 블록이 끝나도 main() 어디서나 temp를 여전히 접근 할 수 있다.
누군가 이 코드를 유지보수 할 때 m은 물론이고 temp까지 계속 신경써야 한다. 스코프가 불필요하게 넓은 것이다.
지금은 코드가 매우 단순해서 이해하는데 어려움이 없겠지만 실무에서는 코드가 매우 복잡한 경우가 많다.
 */