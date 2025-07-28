package Practice;

public class Practice_66 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 3;

        // i=4, endNum = 3

        while(i<=endNum){
            sum = sum + i;
            System.out.println("i= " + i + " sum = "+sum);
            i++;
        }
    }


     // ctrl+e를 누르면 기존 코드들이 나오는데 enter를 누르면 이전걸로 돌아감.
}



/*
위 코드를 보면 while문안에 i가 있으면 되는데
i를 while안에서 선언하면 의도한대로 코드가 실행되지않음.
그래서 불필요하게 i가 main안에서 계속 살아 있음. 메모리 낭비하게된다.
반면에 for문은 for문안에 i를 둘 수 있어서 메모리 낭비를 안한다.
 */

/*
변수는 꼭 필요한 범위로 한정해서 사용하는 것이 좋다. 변수의 스코프는 꼭 필요한 곳으로 한정해서 사용하자.
메모리를 효율적으로 사용하고 더 유지보수하기 좋은 코드를 만들 수 있다.
 */

/*
좋은 프로그램은 무한한 자유가 있는 프로그램이 아닌 적절한 제약이 있는 프로그램임.
 */