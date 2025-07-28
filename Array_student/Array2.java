package Array_student;

public class Array2 {
    public static void main(String[] args) {
        int[] students = new int[5];

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for(int i=0; i< students.length ; i++) // students.length는 배열의 길이 5를 반환함.
        {
            System.out.println("학생"+(i+1)+" 점수: "+students[i]);
        }

        /*
        반복문을 사용해서 배열을 통해 값을 사용하는 부분을 효과적으로 변경했다.
        배열의 인덱스는 0부터 시작하기 때문에 반복문에서 i=0을 초기값으로 사용했다.

        students.length
        -> 배열의 길이를 제공하는 특별한 기능이다.
        -> 참고로 이 값은 조회만 할 수 있다. 대입을 할 수는 없다.
        -> 현재 배열의 크기가 5이기 때문에 여기서는 5가 출력된다.
         */

    }
}
