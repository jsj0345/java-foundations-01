package Practice;

public class Practice_101 {
    public static void main(String[] args) {

       int i = 5;

       while(i--!=0){
           System.out.println(i + " - I can do it.");
       }

    }
}


/*

i--가 후위형 연산자 이므로 조건식이 평가된 후에 i의 값이 감소된다는 점에 주의하여야 한다.

가령, 맨처음에 while문을 들어 갈 때는 5--이고 이때 (5--!=0)을 비교하는 것이다.

이때는 5!=0인 것이다.

그렇다면 마지막에 i는 0까지 갈텐데 (0--!=0)은 0!=0을 의미하는 것이므로 이것은 false이기 때문에 탈출한다.

-1!=0으로 오해하지 말자.


 */