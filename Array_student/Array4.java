package Array_student;

public class Array4 {
    public static void main(String[] args) {

        int[] students = {90,80,70,60,50}; // int[]를 보고 Java가 int형 배열임을 추론. 배열의 생성과 초기화를 간략하게  할 수 있음.

        /*
        int[] students;
        students={90,80,70,60,50}; 이거는 불가능.
         */

        for(int i=0; i<5; i++){
            System.out.println("학생"+(i+1)+"의 점수는 "+students[i]);
        }
    }
}

/*이제 학생의 점수를 추가해도 {90,80,70,60,50}의 내용만 변경하면 된다.
그러면 나머지 코드는 변경하지 않아도 된다.
배열을 사용한 덕분에 프로그램을 전체적으로 잘 구조화 할 수 있었다.
 */
