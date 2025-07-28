package Practice;

public class Practice_31 {

    public static void main(String[] args) {
        int age = 14;

        if (age <= 7) {
            System.out.println("미취학");
        }

        if (age >= 8 && age <= 13) {
            System.out.println("초등학생");
        }

        if ( age >= 14 && age <= 16){
            System.out.println("중학생");
        }

        if ( age >= 17 && age<=19){
            System.out.println("고등학생");
        }

        if (age>=20)
        {
            System.out.println("성인");
        }

    }
}


/* 이 코드의 단점은 무엇일까?
불필요한 조건 검사 : 이미 조건을 만족해도 불필요한 다음 조건을 계속 검사함.

코드 효율성이 매우 떨어짐 -> 조건을 중복 체크해서 그럼.

이런 경우에 else if 문을 사용하면 코드의 효율성을 향상 시킬 수 있음.
 */
